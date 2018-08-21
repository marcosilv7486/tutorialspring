package com.marcosilv7.proyectodemo.seguridad.service.interfaces;

import com.marcosilv7.proyectodemo.seguridad.repository.domain.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SeguridadService {

    Usuario registrarUsuario(Usuario usuario);

    Page<Usuario> obtenerUsuarios(Pageable pageable);

    void eliminarPorId(Integer id);
}
