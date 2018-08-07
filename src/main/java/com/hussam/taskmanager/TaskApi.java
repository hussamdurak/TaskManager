package com.hussam.taskmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.Tasks;
import utils.HibernateUtil;


@RestController
@RequestMapping(value="/api")
public class TaskApi {
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	//bütün kullanýcýlarýn görevlerini getiren api
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public HashMap<String, Object> allTasks() {
		
		Session sesi = sf.openSession();
		HashMap<String, Object> hm = new HashMap<String, Object>();
		
		try {
			@SuppressWarnings("unchecked")
			List<Tasks> ls = sesi.createQuery("from Tasks").list();	
			hm.put("durum", true);
			hm.put("mesaj", "task tablosu getirme basarili");
			hm.put("task", ls);
			sesi.close();
			
		} catch (Exception e) {
			hm.put("durum", false);
			hm.put("mesaj", "task tablosu getirme basarisiz");
			System.err.println("HATA:" + e);		
		}
		return hm;
	}
	
	//giriþ yapan kullanýcýnýn görevlerinin getiren api
	@RequestMapping(value = "/task", method = RequestMethod.GET)
	public String taskApi(HttpServletRequest req) {
		
		String jsonMsg = null;
		int usr = (Integer)req.getSession().getAttribute("uid");
		List<TaskPro> ltp = new ArrayList<TaskPro>();
		Session sesi = sf.openSession();
		
		try {
			@SuppressWarnings("unchecked")
			List<Tasks> ls = sesi.createQuery("from Tasks where taskUserId = '"+usr+"' ").list();
			for (Tasks item : ls) {
				TaskPro tp = new TaskPro();
				tp.setTitle(item.getTaskTitle());
				tp.setStart(item.getTaskDueDate().toString());
				ltp.add(tp);
			}
			ObjectMapper mapper = new ObjectMapper();
            jsonMsg =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ltp);
			
			sesi.close();
		} catch (Exception e) {
			System.err.println("Api Hata : " + e);
		}

		return jsonMsg;
	}

}
