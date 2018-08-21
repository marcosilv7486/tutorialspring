package com.marcosilv7.proyectodemo.seguridad.controller;

import com.marcosilv7.proyectodemo.seguridad.repository.domain.Usuario;
import com.marcosilv7.proyectodemo.seguridad.service.interfaces.SeguridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {


    private final SeguridadService seguridadService;

    @Autowired
    public UsuarioController(SeguridadService seguridadService) {
        this.seguridadService = seguridadService;
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody @Valid Usuario usuario){
        return seguridadService.registrarUsuario(usuario);
    }

    @GetMapping
    public Page<Usuario> listarUsuarios(Pageable pageable){
        return seguridadService.obtenerUsuarios(pageable);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
         seguridadService.eliminarPorId(id);
    }
}
