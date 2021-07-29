package com.plexus.proyecto.Lostrip.Service;

import java.util.List;

import com.plexus.proyecto.Lostrip.Entity.Usuario;

public interface UsuarioService {

	public Usuario findOne(String Id);
	public List<Usuario> findAll();
	public Usuario add(Usuario nuevoAlojamiento);
	public void delete(Usuario alojamiento);
}
