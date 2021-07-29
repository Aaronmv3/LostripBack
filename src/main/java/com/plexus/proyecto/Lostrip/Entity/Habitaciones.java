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
public class Habitaciones {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombreHab;
	
	private int precio;
	
	private int capacidad;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<FotosHab> fotosHab = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Caracteristicas> caracteristicas = new ArrayList<>();

	/**
	 * 
	 */
	public Habitaciones() {
	}

	/**
	 * @param id
	 */
	public Habitaciones(long id) {
		this.id = id;
	}

	/**
	 * @param nombreHab
	 * @param precio
	 * @param capacidad
	 */
	public Habitaciones(String nombreHab, int precio, int capacidad) {
		this.nombreHab = nombreHab;
		this.precio = precio;
		this.capacidad = capacidad;
	}

	
	//Getters y setters
	
	/**
	 * @return the nombreHab
	 */
	public String getNombreHab() {
		return nombreHab;
	}

	/**
	 * @param nombreHab the nombreHab to set
	 */
	public void setNombreHab(String nombreHab) {
		this.nombreHab = nombreHab;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the fotosHab
	 */
	public List<FotosHab> getFotosHab() {
		return fotosHab;
	}

	/**
	 * @return the caracteristicas
	 */
	public List<Caracteristicas> getCaracteristicas() {
		return caracteristicas;
	}
	
	//Helpers
	public void addFoto(FotosHab foto) {
		fotosHab.add(foto);
	}
	
	public void removeFoto(FotosHab foto) {
		fotosHab.remove(foto);
	}
	public void addCaracteristica(Caracteristicas carac) {
		caracteristicas.add(carac);
	}
	
	public void removeCaracteristica(Caracteristicas carac) {
		caracteristicas.remove(carac);
	}
	
	
}
