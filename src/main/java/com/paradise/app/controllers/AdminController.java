package com.paradise.app.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value = "/time.html", method = RequestMethod.GET)
	public @ResponseBody String getTime(@RequestParam String name) {
		String result = "Time for " + name + " is " + new Date().toString();
		return result;
	}

}
