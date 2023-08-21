package com.uspring.USpring.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
