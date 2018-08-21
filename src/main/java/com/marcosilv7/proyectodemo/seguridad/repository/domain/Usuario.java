package com.marcosilv7.proyectodemo.seguridad.repository.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "seguridad_usuarios")
public class Usuario {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    @NotNull
    @Size(min = 1,max = 100)
    private String nombre;

    @Column(name = "apellidos")
    @Size(min = 1,max = 100)
    private String apellidos;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    public Usuario(){}

    public Usuario(Integer id,String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
