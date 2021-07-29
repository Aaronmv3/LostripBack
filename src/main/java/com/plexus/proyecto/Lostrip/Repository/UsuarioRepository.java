package com.plexus.proyecto.Lostrip.Repository;

import org.springframework.data.repository.CrudRepository;

import com.plexus.proyecto.Lostrip.Entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
}
