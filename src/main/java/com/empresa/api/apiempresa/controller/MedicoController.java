package com.empresa.api.apiempresa.controller;
import com.empresa.api.apiempresa.medico.DatosRegistroMedico;
import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping
    public void registrarMedico(@RequestBody DatosRegistroMedico parametro){
        System.out.println(parametro);
    }

}
