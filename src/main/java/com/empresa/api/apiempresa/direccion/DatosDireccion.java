package com.empresa.api.apiempresa.direccion;

import jakarta.validation.constraints.NotBlank;

//Definicion de una clase record con todos sus elementos a partir del constructor sin tocar codigo en sus interior
public record DatosDireccion(@NotBlank String calle,@NotBlank String distrito,@NotBlank String ciudad,@NotBlank String numero,@NotBlank String complemento) {
}