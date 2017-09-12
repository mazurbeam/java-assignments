package com.mazurbeam.grouplanguages.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.mazurbeam.grouplanguages.services.LanguageService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mazurbeam.grouplanguages.models.Language;

@Controller
public class Languages {
	
	private final LanguageService languageService;
	
	public Languages(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		model.addAttribute("language", new Language());
		return "index.jsp";
	}
	
	@RequestMapping("/new")
	public String newLanguage(@ModelAttribute("languages") Language lang) {
		Language newLang; 
		return "redirect:/";
		
	}
	
}
