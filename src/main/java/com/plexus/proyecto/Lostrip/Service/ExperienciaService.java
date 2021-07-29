package com.plexus.proyecto.Lostrip.Service;

import java.util.List;

import com.plexus.proyecto.Lostrip.Entity.Experiencias;

public interface ExperienciaService {

	public Experiencias findOne(Long Id);
	public List<Experiencias> findAll();
	public Experiencias add(Experiencias nuevaExperiencia);
	public void delete(Experiencias experiencia);
}
