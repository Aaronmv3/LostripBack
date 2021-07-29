package com.plexus.proyecto.Lostrip.Controllers;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.plexus.proyecto.Lostrip.Service.CloudinaryService;

@RestController
@RequestMapping("/cloudinary")
@CrossOrigin
public class CloudinaryController {

	@Autowired
	CloudinaryService cloudinaryService;
	
	@SuppressWarnings("rawtypes")
	@PostMapping(path="/upload")
	public ResponseEntity<Map> upload(@RequestParam MultipartFile multipartFile) throws IOException{
		Map result = cloudinaryService.upload(multipartFile);
		return new ResponseEntity<Map>(result, HttpStatus.OK);
		
	}
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping(path="/delete/{id}")
	public ResponseEntity<Map> delete(@PathVariable("id") String id) throws IOException{
		Map result = cloudinaryService.delete(id);
		return new ResponseEntity<Map>(result, HttpStatus.OK);
		
	}
	
}
