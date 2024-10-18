package com.demo.apirest.personas.services;

import org.springframework.stereotype.Service;

import com.demo.apirest.personas.Person;
import com.demo.apirest.personas.repository.PersonRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonServices {

    private final PersonRepo personRepo;
    public void createPerson(Person person) {
        personRepo.save(person);

    }
}
