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

import com.plexus.proyecto.Lostrip.Entity.ComentariosEx;
import com.plexus.proyecto.Lostrip.Entity.Experiencias;
import com.plexus.proyecto.Lostrip.Service.ExperienciaService;


@RestController
@RequestMapping("/experiencia")
public class ExperienciasController {
	
	@Autowired
	private ExperienciaService experienciaService;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public ResponseEntity<List<Experiencias>> experienciasGetAll() { 
		
		logger.info("Get All Experiencia");
		
		return ResponseEntity.ok(this.experienciaService.findAll());

	}
	@GetMapping(path = "{id}")
	public ResponseEntity<Experiencias> experienciasGetOne(@PathVariable(name= "id") Long id) {
		
		logger.info("Get Experiencia for id :"+id);
		
		return ResponseEntity.ok(this.experienciaService.findOne(id));

	}
	
	@PostMapping()
	public  ResponseEntity<Experiencias> add(@RequestBody Experiencias  exp) {
			logger.info("Creating experiencia");
		 	return ResponseEntity.ok(this.experienciaService.add(exp));
	}
	
	@PutMapping()
	public  ResponseEntity<Experiencias> update(@RequestBody Experiencias  exp) {
		
		logger.info("Updating experiencia");
		return ResponseEntity.ok(this.experienciaService.add(exp));
		
	}
	
	@PostMapping(path="/borrar")
	public  ResponseEntity<String> delete(@RequestBody Experiencias exp) {
		logger.info("deleting experiencia");
		
		this.experienciaService.delete(exp);
		return ResponseEntity.ok("Borrado");
	}
	
	@PostMapping(path="{id}/comentario/borrar")
	public  ResponseEntity<String> deleteComent(@RequestBody ComentariosEx coment, @PathVariable(name= "id") Long id) {
		logger.info("deleting comentario of experiencia");
		ComentariosEx comentDel = new ComentariosEx(coment.getId(), coment.getComentario(), coment.getUserID());
		Experiencias exp = this.experienciaService.findOne(coment.getId());

		for(ComentariosEx c : exp.getComentarios()) {
			if(c.getId() == comentDel.getId()) {
				comentDel = c;
				break;
			}
		}
		exp.removeComentario(comentDel);
		this.experienciaService.add(exp);
		return ResponseEntity.ok("Borrado");
		
	}
}
