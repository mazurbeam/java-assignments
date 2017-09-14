package com.mazurbeam.grouplanguages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.grouplanguages.models.Language;
import com.mazurbeam.grouplanguages.respoitories.LanguageRepository;


@Service
public class LanguageService {
	private LanguageRepository languageRepository;
	
	public List<Language> allLanguages(){
		return (List<Language>) languageRepository.findAll();
	}
	
	public void addLanguage(Language newLang) {
		languageRepository.save(newLang);
	}
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public void destoryLanguage(Long id) {
		languageRepository.delete(id);
	}
}
