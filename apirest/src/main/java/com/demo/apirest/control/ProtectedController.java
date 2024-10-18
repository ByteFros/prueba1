package com.demo.apirest.control;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor

public class ProtectedController {

    @PostMapping(value = "demo")
    public String helloP() {

        return "saludo desde un endpoint protegido";
    }
    
}
/*Spring security proteje todos los endpoints por defecto asi que se le debe indicar cuales endpoints
 * son publicos y cuales no
 */