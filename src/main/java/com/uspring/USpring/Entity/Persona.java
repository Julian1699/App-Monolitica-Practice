package com.uspring.USpring.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "persona")
public class Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "nombre")
    private String nombre;

    @NotEmpty(message = "Este campo es obligatorio")
    @Column(name = "apellido")
    private String apellido;

    @NotEmpty
    @Email(message = "El email debe ser válido")
    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;
}
