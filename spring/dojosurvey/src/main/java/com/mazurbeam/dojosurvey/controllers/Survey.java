package com.mazurbeam.dojosurvey.controllers;

public class Survey {
	private String name;
	private String location;
	private String favoriteLanguage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	public Survey() {
		
	}
	public Survey(String formName, String formLocation, String language) {
		this.setName(formName);
		this.setLocation(formLocation);
		this.setFavoriteLanguage(language);
	}
}
