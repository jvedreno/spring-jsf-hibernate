package com.paradise.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller(value = "adminController")
public class AdminController extends AbstractController {

	
	@RequestMapping("/admin/index.html")
	public String index() {
		log.info("/index.htm ");
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin/form.html", method = RequestMethod.POST)
	public String form(@RequestParam String name, @RequestParam String param) {
		log.info("/index.htm ");
		return "/";
	}
	
	public Boolean pepe() {
		System.out.println("hola");
		return false;
		
	}
	
}
