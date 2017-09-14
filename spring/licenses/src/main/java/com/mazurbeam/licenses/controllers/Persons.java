package com.mazurbeam.licenses.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mazurbeam.licenses.models.Person;
import com.mazurbeam.licenses.services.PersonService;

@Controller
@RequestMapping("/persons")
public class Persons {
	
	private final PersonService personService;
	
	public Persons(PersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping("/new")
 	public String newPerson(@ModelAttribute("person") Person person) {
		return "newperson.jsp";
	}
	
	@PostMapping("/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "newperson.jsp";
		} else {
			personService.addPerson(person);
			return "redirect:/persons/new";
		}
	}
}
