package com.plexus.proyecto.Lostrip.Controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.plexus.proyecto.Lostrip.Entity.Reservas;
import com.plexus.proyecto.Lostrip.Entity.Usuario;
import com.plexus.proyecto.Lostrip.Service.UsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public ResponseEntity<List<Usuario>> experienciasGetAll() { 
		
		logger.info("Get All usuarios");
		
		return ResponseEntity.ok(this.usuarioService.findAll());

	}
	@GetMapping(path = "{id}")
	public ResponseEntity<Usuario> experienciasGetOne(@PathVariable(name= "id") String id) {
		
		logger.info("Get usuario for id :"+id);
		
		return ResponseEntity.ok(this.usuarioService.findOne(id));

	}
	
	@PostMapping()
	public  ResponseEntity<Usuario> add(@RequestBody Usuario  user) {
			logger.info("Creating usuario");
		 	return ResponseEntity.ok(this.usuarioService.add(user));
	}
	
	@PostMapping(path="{id}/reserva")
	public  ResponseEntity<Usuario> reserva(@RequestBody Reservas reserva, @PathVariable(name= "id") String idUsuario) {
		logger.info("Añadiendo reserva");
		Usuario user = this.usuarioService.findOne(idUsuario);
		user.addReserva(reserva);
	 	return ResponseEntity.ok(this.usuarioService.add(user));
}
	
	@PostMapping(path = "/imagen")
	public  ResponseEntity<String> prueba(@RequestParam MultipartFile multipartFile, @RequestParam String id) throws IOException {
			logger.info("Guardando imagen");
			String url = "D:\\Proyecto\\LostripFinal\\src\\assets\\Imagenes\\usuarios\\";
			if(!multipartFile.isEmpty()) {
				byte[] bytes = multipartFile.getBytes();
				Path path = Paths.get(url + id + multipartFile.getOriginalFilename());
				Files.write(path, bytes);
			}
			return ResponseEntity.ok(url + id + multipartFile.getOriginalFilename());
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping()
	public  ResponseEntity<Usuario> update(@RequestBody Usuario  user) {
		
		logger.info("Updating usuario");
		return ResponseEntity.ok(this.usuarioService.add(user));
		
	}
	@PostMapping(path = "{id}/reserva/borrar")
	public  ResponseEntity<String> deleteReserva(@RequestBody Reservas reserva, @PathVariable(name= "id") String idUsuario) {
		logger.info("deleting reserva");
		
		Usuario user = this.usuarioService.findOne(idUsuario);
		
		
		for(Reservas r : user.getReservas()) {
			if(r.getAlojamientoId() == reserva.getAlojamientoId()) {
				reserva = r;
				break;
			}
		}
		user.deleteReserva(reserva);
		this.usuarioService.add(user);
		
		return ResponseEntity.ok("Borrado");
	}
	@PostMapping(path = "/borrado")
	public  ResponseEntity<String> delete(@RequestBody Usuario  user) {
		logger.info("deleting usuario");
		
		this.usuarioService.delete(user);
		return ResponseEntity.ok("Borrado");
	}
	
}
