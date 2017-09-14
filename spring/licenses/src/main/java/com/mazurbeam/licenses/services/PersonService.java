package com.mazurbeam.licenses.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.licenses.models.Person;
import com.mazurbeam.licenses.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personRepository;
	
	public List<Person> allPersons(){
		return (List<Person>) personRepository.findAll();
	}
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public void addPerson(Person newPerson) {
		this.personRepository.save(newPerson);
	}
	
	public void destroyPerson(Long id) {
		this.personRepository.delete(id);
	}
}
