package com.plexus.proyecto.Lostrip.Service;

import java.util.List;

import com.plexus.proyecto.Lostrip.Entity.Alojamientos;

public interface AlojamientoService {

	public Alojamientos findOne(Long Id);
	public List<Alojamientos> findAll();
	public Alojamientos add(Alojamientos nuevoAlojamiento);
	public void delete(Alojamientos alojamiento);
}
