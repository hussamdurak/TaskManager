package com.hussam.taskmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TimelineController {
	
	
	@RequestMapping(value = "/timeline", method = RequestMethod.GET)
	public String timeline() {
		
		
		return "timeline";
	}

}
