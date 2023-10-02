package com.empresa.api.apiempresa.medico;

import com.empresa.api.apiempresa.direccion.DatosDireccion;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

//Definicion de una clase record con todos sus elementos a partir del constructor sin tocar codigo en sus interior
//De lo contrario habira que crear una claase DTO de tipo final y atributos final
public record DatosRegistroMedico (@NotBlank String nombre, @NotBlank @Email String email, @NotBlank String telefono, @NotBlank @Pattern(regexp = "\\d{4,6}") String documento, @NotNull @Valid Especialidad especialidad, @NotNull @Valid DatosDireccion direccion){


}
