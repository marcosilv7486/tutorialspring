package com.marcosilv7.proyectodemo.seguridad.service.impl;

import com.marcosilv7.proyectodemo.seguridad.repository.domain.Usuario;
import com.marcosilv7.proyectodemo.seguridad.repository.interfaces.UsuarioRepository;
import com.marcosilv7.proyectodemo.seguridad.service.interfaces.SeguridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SeguridadServiceImpl implements SeguridadService {

    private final UsuarioRepository repository;

    @Autowired
    public SeguridadServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Usuario registrarUsuario(Usuario usuario) {
        usuario = repository.save(usuario);
        System.out.print("El id del iusuario es "+usuario.getId());
        return  usuario;
    }

    @Override
    public Page<Usuario> obtenerUsuarios(Pageable pageable) {
        return repository.obtenerSoloIdYNombre(pageable);
    }

    @Override
    @Transactional
    public void eliminarPorId(Integer id) {
        Usuario usuario = repository.findById(id).orElseThrow(()-> new RuntimeException("No se encontro el id"));
        repository.delete(usuario);
    }
}
