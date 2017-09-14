package com.mazurbeam.licenses.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.licenses.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

}
