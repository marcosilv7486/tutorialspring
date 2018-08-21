package com.marcosilv7.proyectodemo.seguridad.repository.interfaces;

import com.marcosilv7.proyectodemo.seguridad.repository.domain.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario,Integer> {

    @Query("select new Usuario (u.id,u.nombre) from Usuario u")
    Page<Usuario> obtenerSoloIdYNombre(Pageable pageable);
}
