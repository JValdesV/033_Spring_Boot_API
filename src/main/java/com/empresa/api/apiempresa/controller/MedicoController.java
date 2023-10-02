package com.empresa.api.apiempresa.controller;
import com.empresa.api.apiempresa.medico.DatosRegistroMedico;
import com.empresa.api.apiempresa.medico.Medico;
import com.empresa.api.apiempresa.medico.MedicoRepository;
import com.fasterxml.jackson.databind.JsonNode;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistro){
        //System.out.println(parametro);

        medicoRepository.save(new Medico(datosRegistro));

    }

}
