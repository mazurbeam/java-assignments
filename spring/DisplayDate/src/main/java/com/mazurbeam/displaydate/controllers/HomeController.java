package com.mazurbeam.displaydate.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("/date")
	public String date(Model model) {
		Date d = new Date();
		model.addAttribute("day", d.getDay());
		model.addAttribute("date", d.getDate());
		model.addAttribute("month", d.getMonth());
		model.addAttribute("year", d.getYear());
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time() {
		return "time.jsp";
	}
}
