package com.empresa.api.apiempresa.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bienvenidos")
public class HolaController {
    @GetMapping
    public String holaMundo(){
        return "Usted digito la url /bienvenido y se le devolvio el metodo holaMundo";
    }

}
