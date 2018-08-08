package com.hussam.taskmanager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.Tasks;
import utils.HibernateUtil;
import utils.Utils;

@Controller
public class TaskController {
	
SessionFactory sf = HibernateUtil.getSessionFactory();
	
	@RequestMapping(value = "/task", method = RequestMethod.GET)
	public String openAdmin(HttpServletRequest req,Model model) {
		
		int id = (Integer)req.getSession().getAttribute("uid");
		
		//kullanýcýnýn bütün görevlerini getirir
		Session sesi = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Tasks> ls = sesi.createQuery("from Tasks where taskUserId = '"+id+"' ").list();
		model.addAttribute("ls", ls);
		
		
		sesi.close();
		
		return Utils.loginControl(req, "task"); //session denetimi
	}
	

}
