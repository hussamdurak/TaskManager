package com.hussam.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class UserAddController {
	
	@RequestMapping(value = "/userAdd", method = RequestMethod.GET)
	public String userAdd() {
		
		return "admin/userAdd";
	}

}
