package com.hussam.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class UserEditController {
	
	@RequestMapping(value = "/userEdit", method = RequestMethod.GET)
	public String userEdit() {
		
		return "admin/userEdit";
	}

}
