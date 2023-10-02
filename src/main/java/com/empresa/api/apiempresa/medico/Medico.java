package com.empresa.api.apiempresa.medico;

import com.empresa.api.apiempresa.direccion.Direccion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="medicos")
@Entity(name="Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;

    public Medico(DatosRegistroMedico datosRegistro) {
        this.nombre = datosRegistro.nombre();
        this.email = datosRegistro.email();
        this.telefono = datosRegistro.telefono();
        this.documento = datosRegistro.documento();
        this.especialidad = datosRegistro.especialidad();
        this.direccion = new Direccion(datosRegistro.direccion());
    }
}
