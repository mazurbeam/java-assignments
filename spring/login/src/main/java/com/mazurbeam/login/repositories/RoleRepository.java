package com.mazurbeam.login.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.login.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
	List<Role> findAll();
    
    List<Role> findByName(String name);
}
