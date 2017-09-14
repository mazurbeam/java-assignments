package com.mazurbeam.licenses.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.licenses.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{

}
