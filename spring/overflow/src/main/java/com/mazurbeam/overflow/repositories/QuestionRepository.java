package com.mazurbeam.overflow.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mazurbeam.overflow.models.Question;

public interface QuestionRepository extends CrudRepository<Question, Long>{

}
