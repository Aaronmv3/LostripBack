package com.plexus.proyecto.Lostrip.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String alojamientoId;
	
	
	//Constructors
	/**
	 * 
	 */
	public Reservas() {
	}


	/**
	 * @param alojamientoId
	 */
	public Reservas(String alojamientoId) {
		this.alojamientoId = alojamientoId;
	}


	/**
	 * @return the alojamientoId
	 */
	public String getAlojamientoId() {
		return alojamientoId;
	}


	/**
	 * @param alojamientoId the alojamientoId to set
	 */
	public void setAlojamientoId(String alojamientoId) {
		this.alojamientoId = alojamientoId;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	
	
	
	
}
