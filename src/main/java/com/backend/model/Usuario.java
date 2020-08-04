package com.backend.model;

import javax.persistence.*;

@Entity
@Table( name = "usuarios" )
public class Usuario {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( unique = true, nullable = false )
    private Long id;

    @Column( nullable = false )
    private String nombre;

    @Column( nullable = false )
    private String apellido;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
