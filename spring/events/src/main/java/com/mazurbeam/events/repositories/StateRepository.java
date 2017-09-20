package com.mazurbeam.events.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.events.models.State;

@Repository
public interface StateRepository extends CrudRepository<State, Long>{
	List<State> findAll();

}
