package com.plexus.proyecto.Lostrip.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Caracteristicas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String caracteristica;

	/**
	 * 
	 */
	public Caracteristicas() {
	}

	/**
	 * @param caracteristica
	 */
	public Caracteristicas(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the caracteristica
	 */
	public String getCaracteristica() {
		return caracteristica;
	}

	/**
	 * @param caracteristica the caracteristica to set
	 */
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	

	
	
}
