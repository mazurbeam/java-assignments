package com.mazurbeam.overflow.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mazurbeam.overflow.models.Question;
import com.mazurbeam.overflow.services.QuestionService;

@Controller
public class Questions {
	
	private final QuestionService questionService;
	
	public Questions(QuestionService questionService) {
		this.questionService = questionService;
	}
	@RequestMapping("/questions")
	public String index(Model model) {
		List<Question> questions = questionService.allQuestions();
		model.addAttribute("questions", questions);
		return "index.jsp";
	}
	
	@RequestMapping("/questions/new")
	public String newQuestion(@ModelAttribute("question") String question, @ModelAttribute("tags") String tags) {
		return "newquestion.jsp";
	}
	
	@PostMapping("/questions/new")
	public String createQuestion(@ModelAttribute("question") Question question, BindingResult result) {
		if(result.hasErrors()) {
			return "newquestion.jsp";
		} else {
			questionService.addQuestion(question);
			return "redirect:/questions";
		}
	}
}
