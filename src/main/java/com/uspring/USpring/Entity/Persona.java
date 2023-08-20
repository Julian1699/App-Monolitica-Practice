package com.uspring.USpring.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Data
@Table(name = "persona")
public class Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre no debe estar vacio papi")
    @Column(name = "nombre")
    private String nombre;

    @NotEmpty(message = "Cual es eja mani, sin apellido?")
    @Column(name = "apellido")
    private String apellido;

    @NotEmpty
    @Email(message = "El email debe ser válido")
    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;
}
