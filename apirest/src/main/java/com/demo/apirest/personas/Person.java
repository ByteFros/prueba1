package com.demo.apirest.personas;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// entity permite que la clase se convierta en una tabla de la base de datos 
@Entity

// la entidad data nos genera getters y setters automaticamente
@Data

// la entidad allargsconstructor nos genera los constructores con todos los argumentos automaticamente
@AllArgsConstructor

// la entidad noargsconstructor nos genera el constructor sin argumentos automaticamente
@NoArgsConstructor

public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String name;
    private String lastName;
    private String email;

}
