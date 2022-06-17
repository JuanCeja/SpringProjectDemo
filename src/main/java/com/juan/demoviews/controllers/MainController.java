package com.juan.demoviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(Model model) {
		String x = "hello from the controller";
		model.addAttribute("x", x);
		model.addAttribute("somekey", 99);
		
		String name = "Juan";
		String lName= "Ceja";
		String bday = "April 8th";
		
		model.addAttribute("fist", name);
		model.addAttribute("lname", lName);
		model.addAttribute("bday", bday);
		return "demo.jsp";
	}
	
	@RequestMapping("/cooler")
	public String cooler() {
		return "cooler.jsp";
	}
}
