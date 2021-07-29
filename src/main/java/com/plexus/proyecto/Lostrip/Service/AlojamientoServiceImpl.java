package com.plexus.proyecto.Lostrip.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plexus.proyecto.Lostrip.Entity.Alojamientos;
import com.plexus.proyecto.Lostrip.Repository.AlojamientosRepository;

@Service
public class AlojamientoServiceImpl implements AlojamientoService{
	
	@Autowired
	private AlojamientosRepository alojamientoRepository;

	@Override
	public Alojamientos findOne(Long Id) {
		return this.alojamientoRepository.findById(Id).get();
	}

	@Override
	public List<Alojamientos> findAll() {
		return (List<Alojamientos>) this.alojamientoRepository.findAll();
	}

	@Override
	public Alojamientos add(Alojamientos nuevoAlojamiento) {
		return this.alojamientoRepository.save(nuevoAlojamiento);
		
	}

	@Override
	public void delete(Alojamientos alojamiento) {
		this.alojamientoRepository.delete(alojamiento);
		
		
	}

}
