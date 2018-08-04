package com.hussam.taskmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskAddController {
	
	@RequestMapping(value = "/taskAdd", method = RequestMethod.GET)
	public String userTaskAdd() {
		
		return "taskAdd";
	}

}
