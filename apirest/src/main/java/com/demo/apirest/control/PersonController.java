package com.demo.apirest.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.apirest.personas.Person;
import com.demo.apirest.personas.services.PersonServices;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/personas")
@RequiredArgsConstructor
public class PersonController {

    private final PersonServices personServices;

    @PostMapping
    public void createPerson(@RequestBody Person person) {
        
        personServices.createPerson(person);
    }

    @GetMapping
    public String saludo(){
        return "Hola mundo ahora con spring security";
    }
    
    

}
