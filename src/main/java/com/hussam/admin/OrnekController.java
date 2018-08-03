package com.hussam.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class OrnekController {
	
	
	@RequestMapping(value = "/ornek", method = RequestMethod.GET)
	public String ornekAc() {
		
		
		return "admin/ornek";
	}

}
