package com.mazurbeam.grouplanguages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.grouplanguages.models.Language;


@Service
public class LanguageService {
	private List<Language> languages = new ArrayList<Language>(Arrays.asList(
			new Language("python", "guido van rossum", "3.6"),
			new Language("java","james gosling","1.8")
			));
	
	public List<Language> allLanguages(){
		return languages;
	}
	
	public void addLanguage(Language newLang) {
		this.languages.add(newLang);
	}
}
