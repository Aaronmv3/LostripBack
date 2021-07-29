package com.plexus.proyecto.Lostrip.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plexus.proyecto.Lostrip.Entity.Usuario;
import com.plexus.proyecto.Lostrip.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario findOne(String Id) {
		return this.usuarioRepository.findById(Id).get();
	}

	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) this.usuarioRepository.findAll();
	}

	@Override
	public Usuario add(Usuario nuevoUsuario) {
		return this.usuarioRepository.save(nuevoUsuario);
		
	}

	@Override
	public void delete(Usuario usuario) {
		this.usuarioRepository.delete(usuario);
		
		
	}

}
