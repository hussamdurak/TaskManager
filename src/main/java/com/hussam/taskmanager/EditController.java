package com.hussam.taskmanager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.Tasks;
import utils.HibernateUtil;
import utils.Utils;

@Controller
public class EditController {
	
	int taskId;
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String openTaskEdit(@PathVariable Integer id, Model model, HttpServletRequest req) {
		taskId = id;
		Session sesi = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Tasks> ls = sesi.createQuery("from Tasks where taskId = '"+taskId+"' ").setMaxResults(1).list();
		model.addAttribute("ls", ls);
		sesi.close();
		return "edit";
	}
	
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String taskEdit(Tasks task, HttpServletRequest req) {
		
		Session sesi = sf.openSession();
		Transaction tr = sesi.beginTransaction();
		task.setTaskId(taskId);
		sesi.update(task);
		tr.commit();
		sesi.close();
		
		return "redirect:/" + Utils.loginControl(req, "home");
	}

}
