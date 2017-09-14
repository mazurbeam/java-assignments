package com.mazurbeam.overflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Questions {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
}
