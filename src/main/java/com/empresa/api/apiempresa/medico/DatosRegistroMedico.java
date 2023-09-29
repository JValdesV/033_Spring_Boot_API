package com.empresa.api.apiempresa.medico;

import com.empresa.api.apiempresa.direccion.DatosDireccion;

//Definicion de una clase record con todos sus elementos a partir del constructor sin tocar codigo en sus interior
//De lo contrario habira que crear una claase DTO de tipo final y atributos final
public record DatosRegistroMedico (String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion){


}
