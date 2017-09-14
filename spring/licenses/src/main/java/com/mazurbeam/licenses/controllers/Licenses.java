package com.mazurbeam.licenses.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mazurbeam.licenses.models.License;
import com.mazurbeam.licenses.models.Person;
import com.mazurbeam.licenses.services.LicenseService;
import com.mazurbeam.licenses.services.PersonService;

@Controller
@RequestMapping("/licenses")
public class Licenses {
	
	private final LicenseService licenseService;
	private final PersonService personService;
	
	public Licenses(LicenseService licenseService, PersonService personService) {
		this.licenseService =  licenseService;
		this.personService = personService;
	}
	
	@RequestMapping("/new")
	public String newLicense(Model model, @ModelAttribute("license") License license) {
		List<Person> people = personService.allPersons();
		model.addAttribute("people", people);
		return "newlicense.jsp";
	}
	
	@PostMapping("/new")
	public String createLicense(@ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "newlicense.jsp";
		} else {
			licenseService.addLicense(license);
			return "redirect:/licenses/new";
		}
	}
}
