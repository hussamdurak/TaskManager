package com.hussam.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IncluderController {

	// admin üst bölümü çaðýran inc fonksiyonu
	@RequestMapping(value = "/admin/header", method = RequestMethod.GET)
	public String header() {
		return "admin/inc/header";
	}

	// admin CSS bölümü çaðýran inc fonksiyonu
	@RequestMapping(value = "/admin/css", method = RequestMethod.GET)
	public String css() {
		return "admin/inc/css";
	}

	// admin menü bölümü çaðýran inc fonksiyonu
	@RequestMapping(value = "/admin/menu", method = RequestMethod.GET)
	public String menu() {
		return "admin/inc/menu";
	}

	// admin js bölümü çaðýran inc fonksiyonu
	@RequestMapping(value = "/admin/js", method = RequestMethod.GET)
	public String js() {
		return "admin/inc/js";
	}

	// admin footer bölümü çaðýran inc fonksiyonu
	@RequestMapping(value = "/admin/footer", method = RequestMethod.GET)
	public String footer() {
		return "admin/inc/footer";
	}

	// admin sidebar bölümü çaðýran inc fonksiyonu
	@RequestMapping(value = "/admin/sidebar", method = RequestMethod.GET)
	public String sidebar() {
		return "admin/inc/sidebar";
	}

}
