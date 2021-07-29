package com.plexus.proyecto.Lostrip.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Experiencias {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	
	private String dueno;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<FiltrosExp> filtrosExp = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ComentariosEx> comentariosExp = new ArrayList<>();;
	
	private String localizacion;
	
	private int estrellas;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<FotosExp> fotosExp = new ArrayList<>();
	
	private boolean oferta;
	
	private int precio;
	
	private double valoracion;
	
	private String descripcion;

	//Constructores
	
	/**
	 * 
	 */
	public Experiencias() {
	}

	/**
	 * @param nombre
	 * @param localizacion
	 * @param estrellas
	 * @param oferta
	 * @param precio
	 * @param valoracion
	 * @param descripcion
	 */
	public Experiencias(String nombre, String localizacion, int estrellas, boolean oferta, int precio, double valoracion,
			String descripcion, String dueno) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.estrellas = estrellas;
		this.oferta = oferta;
		this.precio = precio;
		this.valoracion = valoracion;
		this.descripcion = descripcion;
		this.dueno = dueno;
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
	public List<FiltrosExp> getFiltros() {
		return filtrosExp;
	}

	/**
	 * @return the comentarios
	 */
	public List<ComentariosEx> getComentarios() {
		return comentariosExp;
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
	public List<FotosExp> getFotos() {
		return fotosExp;
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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param dueno the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
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
	//Helpers

	public void addComentario(ComentariosEx comentario) {
		comentariosExp.add(comentario);
	}
	
	public void removeComentario(ComentariosEx comentario) {
		comentariosExp.remove(comentario);
	}
	
	public void addFoto(FotosExp foto) {
		fotosExp.add(foto);
	}
	
	public void removeFoto(FotosExp foto) {
		fotosExp.remove(foto);
	}
	
	public void addFiltro(FiltrosExp filtro) {
		filtrosExp.add(filtro);
	}
	
	public void removeFiltro(FiltrosExp filtro) {
		filtrosExp.remove(filtro);
	}
	
}
