package com.empresa.api.apiempresa.controller;
import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping
    public void registrarMedico(@RequestBody JsonNode parametro){
        //Obtencion del requestbody y se imprime por consola
        System.out.println(parametro);

        //Se intercepta el parametro nombre del RequestBody
        System.out.println(parametro.get("nombre").asText());

        //Si queremos precisar una respuesta al momento de realizar la peticion
        System.out.println("El request a llegado correctamente");

    }

}
