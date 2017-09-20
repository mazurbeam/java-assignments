package com.mazurbeam.overflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.overflow.models.Question;
import com.mazurbeam.overflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	private QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public List<Question> allQuestions(){
		return (List<Question>) questionRepository.findAll();
	}
	
	public void addQuestion(Question question) {
		this.questionRepository.save(question);
	}
}
