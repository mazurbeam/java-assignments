package com.mazurbeam.events.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.events.models.State;
import com.mazurbeam.events.repositories.StateRepository;

@Service
public class StateService {
	private StateRepository stateRepository;
	
	public StateService(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}
	
	public List<State> allStates(){
		return stateRepository.findAll();
	}

	public StateRepository getStateRepository() {
		return stateRepository;
	}

	public void setStateRepository(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}
	
	
}
