package com.mazurbeam.grouplanguages.models;

public class Language {
	
	@Size(min=2, max=20)
	private String name;
	
	@Size(min=2,max=20)
	private String creator;
	
	@Required
	private String version;
	
	public Language() {		
	}
	
	public Language(String name, String createdBy, String ver) {
		this.name = name;
		this.creator = createdBy;
		this.version = ver;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
