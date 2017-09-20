package com.mazurbeam.events.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="states")
public class State {
	@Id
    @GeneratedValue
    private Long id;
	private String name;
	
	@OneToMany(mappedBy="state", fetch = FetchType.LAZY)
	private List<User> users;
	
	@OneToMany(mappedBy="state", fetch = FetchType.LAZY)
	private List<Event> events;
	
	public State() {
		
	}
	
	public State(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
