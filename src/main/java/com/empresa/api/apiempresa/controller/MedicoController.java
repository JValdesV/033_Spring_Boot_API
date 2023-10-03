package com.empresa.api.apiempresa.controller;
import com.empresa.api.apiempresa.medico.*;
import com.fasterxml.jackson.databind.JsonNode;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
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
    //El metodo soporta la cantidad de registros por hoja y el numero de hoja http://localhost:8080/medicos?size=2&page=0
    public Page<DatosListadoMedico> listadoMedicos(@PageableDefault(size = 20, sort = "nombre",direction = Sort.Direction.DESC) Pageable paginacion){
        return medicoRepository.findByActivoTrue(paginacion).map(DatosListadoMedico::new);
    }
    @PutMapping
    @Transactional
    public void actualizarMedico(@RequestBody @Valid DatosActualizarMedico datosActualizarMedico){
            Medico medico = medicoRepository.getReferenceById(datosActualizarMedico.id());
            medico.actualizarDatos(datosActualizarMedico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarMedico(@PathVariable Long id){
        Medico medico = medicoRepository.getReferenceById(id);
        //Eliminacion fisica del registro
        //medicoRepository.delete(medico);

        //Eliminacion logica
        medico.desactivarMedico();

    }


}
