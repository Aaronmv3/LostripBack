package com.plexus.proyecto.Lostrip.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Alojamientos {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("alojamientos")
	private List<Filtros> filtros = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("alojamiento")
	private List<Comentarios> comentarios = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("alojamiento")
	private List<Fotos> fotos = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Habitaciones> habitaciones = new ArrayList<>();
	
	private String localizacion;
	
	private int estrellas;
	
	private boolean oferta;
	
	private String dueno;
	
	private double valoracion;
	
	private String descripcion;

	//Constructores
	
	/**
	 * 
	 */
	public Alojamientos() {
	}

	/**
	 * @param nombre
	 * @param localizacion
	 * @param estrellas
	 * @param oferta
	 * @param dueno
	 * @param valoracion
	 * @param descripcion
	 */
	public Alojamientos(String nombre, String localizacion, int estrellas, boolean oferta, String dueno, int valoracion,
			String descripcion) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.estrellas = estrellas;
		this.oferta = oferta;
		this.dueno = dueno;
		this.valoracion = valoracion;
		this.descripcion = descripcion;
	}

	//Getters & Setters
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the filtros
	 */
	public List<Filtros> getFiltros() {
		return filtros;
	}

	/**
	 * @return the comentarios
	 */
	public List<Comentarios> getComentarios() {
		return comentarios;
	}


	/**
	 * @return the localizacion
	 */
	public String getLocalizacion() {
		return localizacion;
	}

	/**
	 * @param localizacion the localizacion to set
	 */
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	/**
	 * @return the estrellas
	 */
	public int getEstrellas() {
		return estrellas;
	}

	/**
	 * @param estrellas the estrellas to set
	 */
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	/**
	 * @return the fotos
	 */
	public List<Fotos> getFotos() {
		return fotos;
	}

	/**
	 * @return the oferta
	 */
	public boolean isOferta() {
		return oferta;
	}

	/**
	 * @param oferta the oferta to set
	 */
	public void setOferta(boolean oferta) {
		this.oferta = oferta;
	}

	/**
	 * @return the dueno
	 */
	public String getDueno() {
		return dueno;
	}

	/**
	 * @param dueno the dueno to set
	 */
	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	/**
	 * @return the valoracion
	 */
	public double getValoracion() {
		return valoracion;
	}

	/**
	 * @param d the valoracion to set
	 */
	public void setValoracion(double d) {
		this.valoracion = d;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the habitaciones
	 */
	public List<Habitaciones> getHabitaciones() {
		return habitaciones;
	}
	
	//Helpers
	

	public void addComentario(Comentarios comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(Comentarios comentario) {
		comentarios.remove(comentario);
	}
	
	public void addFoto(Fotos foto) {
		fotos.add(foto);
	}
	
	public void removeFoto(Fotos foto) {
		fotos.remove(foto);
	}
	
	public void addFiltro(Filtros filtro) {
		filtros.add(filtro);
	}
	
	public void removeFiltro(Filtros filtro) {
		filtros.remove(filtro);
	}
	
	public void addHabitacion(Habitaciones hab) {
		habitaciones.add(hab);
	}
	
	public void removeHabitacion(Habitaciones hab) {
		habitaciones.remove(hab);
	}
	
	
}
