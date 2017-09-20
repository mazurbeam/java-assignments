package com.mazurbeam.events.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.events.models.Event;
import com.mazurbeam.events.models.Message;

@Repository
public interface EventRepository extends CrudRepository<Event, Long>{
	List<Event> findAll();
	
	@Query(value="SELECT * FROM events WHERE state_id=?1", nativeQuery=true)
	List<Event> findAllEventsWithStateId(Long id);

}
