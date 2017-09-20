package com.mazurbeam.events.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.events.models.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long>{
	
	@Query(value="SELECT * FROM messages WHERE event_id=?1", nativeQuery=true)
	List<Message> findAllMessagesWithEventId(Long id);
}
