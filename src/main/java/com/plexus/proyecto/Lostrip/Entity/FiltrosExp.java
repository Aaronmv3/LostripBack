package com.plexus.proyecto.Lostrip.Entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FiltrosExp {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String filtros;

	//Constructores
	
	/**
	 * 
	 */
	public FiltrosExp() {
	}

	/**
	 * @param filtros
	 */
	public FiltrosExp(String filtros) {
		this.filtros = filtros;
	}

	
	
	/**
	 * @param id
	 * @param filtros
	 */
	public FiltrosExp(long id, String filtros) {
		this.id = id;
		this.filtros = filtros;
	}

	//Getters & setters
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the filtros
	 */
	public String getFiltros() {
		return filtros;
	}

	/**
	 * @param filtros the filtros to set
	 */
	public void setFiltros(String filtros) {
		this.filtros = filtros;
	}
	
	
}
