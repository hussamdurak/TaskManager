package com.hussam.taskmanager;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.Tasks;
import utils.HibernateUtil;
import utils.Utils;

@Controller
public class AddController {
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String userTaskAdd(HttpServletRequest req) {
		
		return  "redirect:/" + Utils.loginControl(req, "add");
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String taskAdd(Tasks task, HttpServletRequest req) {
		int id = (Integer)req.getSession().getAttribute("uid");
		try {
			Session sesi = sf.openSession();
			Transaction tr = sesi.beginTransaction();
			task.setTaskId(Integer.MAX_VALUE);
			task.setTaskUserId(id);
			sesi.save(task);
			tr.commit();
			sesi.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		
		return  "redirect:/" + Utils.loginControl(req, "home");
	}

}
