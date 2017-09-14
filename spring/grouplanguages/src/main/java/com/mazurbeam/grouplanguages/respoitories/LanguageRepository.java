package com.mazurbeam.grouplanguages.respoitories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mazurbeam.grouplanguages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{

}
