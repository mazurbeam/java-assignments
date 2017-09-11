package com.example.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false, defaultValue = "Human" ) String name, Model model) {
		model.addAttribute("name", name);
		return "index.jsp";
	}
	
}
