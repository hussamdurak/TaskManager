package com.hussam.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IncluderController {

	// admin �st b�l�m� �a��ran inc fonksiyonu
	@RequestMapping(value = "/admin/header", method = RequestMethod.GET)
	public String header() {
		return "admin/inc/header";
	}

	// admin CSS b�l�m� �a��ran inc fonksiyonu
	@RequestMapping(value = "/admin/css", method = RequestMethod.GET)
	public String css() {
		return "admin/inc/css";
	}

	// admin men� b�l�m� �a��ran inc fonksiyonu
	@RequestMapping(value = "/admin/menu", method = RequestMethod.GET)
	public String menu() {
		return "admin/inc/menu";
	}

	// admin js b�l�m� �a��ran inc fonksiyonu
	@RequestMapping(value = "/admin/js", method = RequestMethod.GET)
	public String js() {
		return "admin/inc/js";
	}

	// admin footer b�l�m� �a��ran inc fonksiyonu
	@RequestMapping(value = "/admin/footer", method = RequestMethod.GET)
	public String footer() {
		return "admin/inc/footer";
	}

	// admin sidebar b�l�m� �a��ran inc fonksiyonu
	@RequestMapping(value = "/admin/sidebar", method = RequestMethod.GET)
	public String sidebar() {
		return "admin/inc/sidebar";
	}

}
