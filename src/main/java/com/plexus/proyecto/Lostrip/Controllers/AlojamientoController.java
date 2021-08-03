package com.plexus.proyecto.Lostrip.Controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plexus.proyecto.Lostrip.Entity.Alojamientos;
import com.plexus.proyecto.Lostrip.Entity.Comentarios;
import com.plexus.proyecto.Lostrip.Service.AlojamientoService;


@RestController
@RequestMapping("/alojamiento")
public class AlojamientoController {
	
	@Autowired
	private AlojamientoService alojamientoService;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//Get
	@GetMapping
	public ResponseEntity<List<Alojamientos>> alojamientoGetAll() { 
		
		logger.info("Get All Alojamiento");
		
		
		return ResponseEntity.ok(this.alojamientoService.findAll());

	}
	@GetMapping(path = "{id}")
	public ResponseEntity<Alojamientos> alojamientoGetOne(@PathVariable(name= "id") Long id) {
		
		logger.info("Get Alojamiento for id :"+id);
		
		return ResponseEntity.ok(this.alojamientoService.findOne(id));

	}
	
	//Añadir
	
	@PostMapping()
	public  ResponseEntity<Alojamientos> add(@RequestBody Alojamientos  aloj) {
			logger.info("Creating alojamiento");
		 	return ResponseEntity.ok(this.alojamientoService.add(aloj));
	}
	
	//Actualizacion
	
	@PutMapping()
	public  ResponseEntity<Alojamientos> update(@RequestBody Alojamientos  aloj) {
		
		logger.info("Updating alojamiento");
		return ResponseEntity.ok(this.alojamientoService.add(aloj));
		
	}
	
	//Borrado
	
	@PostMapping(path="/borrar")
	public  ResponseEntity<String> delete(@RequestBody Alojamientos aloj) {
		logger.info("deleting alojamiento");
		
		this.alojamientoService.delete(aloj);
		return ResponseEntity.ok("Borrado");
		
	}
	@PostMapping(path="{id}/comentario/borrar")
	public  ResponseEntity<String> deleteComent(@RequestBody Comentarios coment, @PathVariable(name= "id") Long id) {
		logger.info("deleting comentario of alojamiento");
		Alojamientos aloj = this.alojamientoService.findOne(id);

		for(Comentarios c : aloj.getComentarios()) {
			if(c.getId() == coment.getId()) {
				coment = c;
				break;
			}
		}
		aloj.removeComentario(coment);
		this.alojamientoService.add(aloj);
		return ResponseEntity.ok("Borrado");
		
	}
	
}
