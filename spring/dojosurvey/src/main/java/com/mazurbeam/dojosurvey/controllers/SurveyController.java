package com.mazurbeam.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("survey")
public class SurveyController {
	
	@ModelAttribute("survey")
	public Survey getSurvey() {
		return new Survey();
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/processSurvey", method=RequestMethod.POST)
	public String processSurvey(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="favoriteLanguage") String favoriteLanguage, @ModelAttribute("survey") Survey survey ) {
		Survey newSurvey = new Survey(name, location, favoriteLanguage);
		survey = newSurvey;
		return "redirect:/results";
	}
	
	@RequestMapping("/results")
	public String results(@ModelAttribute("survey") Survey survey) {
		return "results.jsp";
	}
}
