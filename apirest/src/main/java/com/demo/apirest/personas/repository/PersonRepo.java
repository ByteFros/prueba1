package com.demo.apirest.personas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.apirest.personas.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{




}
