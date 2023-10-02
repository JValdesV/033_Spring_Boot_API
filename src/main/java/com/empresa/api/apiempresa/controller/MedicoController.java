package com.empresa.api.apiempresa.controller;
import com.empresa.api.apiempresa.medico.DatosListadoMedico;
import com.empresa.api.apiempresa.medico.DatosRegistroMedico;
import com.empresa.api.apiempresa.medico.Medico;
import com.empresa.api.apiempresa.medico.MedicoRepository;
import com.fasterxml.jackson.databind.JsonNode;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<DatosListadoMedico> listadoMedicos(){
        return medicoRepository.findAll().stream().map(DatosListadoMedico::new).toList();
    }


}
