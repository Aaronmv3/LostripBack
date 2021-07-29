package com.plexus.proyecto.Lostrip.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plexus.proyecto.Lostrip.Entity.Experiencias;
import com.plexus.proyecto.Lostrip.Repository.ExperienciaRepository;

@Service
public class ExperienciaServiceImpl implements ExperienciaService{
	
	@Autowired
	private ExperienciaRepository experienciaRepository;

	@Override
	public Experiencias findOne(Long Id) {
		return this.experienciaRepository.findById(Id).get();
	}

	@Override
	public List<Experiencias> findAll() {
		return (List<Experiencias>) this.experienciaRepository.findAll();
	}

	@Override
	public Experiencias add(Experiencias nuevaExperiencia) {
		return this.experienciaRepository.save(nuevaExperiencia);
		
	}

	@Override
	public void delete(Experiencias experiencia) {
		this.experienciaRepository.delete(experiencia);
		
		
	}

}
