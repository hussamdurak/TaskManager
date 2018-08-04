package com.hussam.admin;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.Tasks;
import models.Users;
import utils.HibernateUtil;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	

	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String openAdmin(Model model) {
		
		Session sesi = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Tasks> lst = sesi.createQuery("from Tasks").list();
		model.addAttribute("lst", lst);
		
		@SuppressWarnings("unchecked")
		List<Users> lsu = sesi.createQuery("from Users").list();
		model.addAttribute("lsu", lsu);
		
		sesi.close();
		
		return "admin/dashboard";
	}
	
	
}
