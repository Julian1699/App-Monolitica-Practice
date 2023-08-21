package com.uspring.USpring.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "username")
    private String username;

    @NotEmpty
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "usuario")
    private List<Rol> roles;

}
