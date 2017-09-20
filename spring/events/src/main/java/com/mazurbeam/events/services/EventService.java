package com.mazurbeam.events.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.events.models.Event;
import com.mazurbeam.events.models.State;
import com.mazurbeam.events.repositories.EventRepository;

@Service
public class EventService {
	private EventRepository eventRepository;
	
	public EventService(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	public void saveEvent(Event event) {
		eventRepository.save(event);
	}
	
	public List<Event> findAllEvents(){
		return eventRepository.findAll();
	}
	
	public List<Event> findAllEventsFromState(State state){
		return eventRepository.findAllEventsWithStateId(state.getId());
	}
}

