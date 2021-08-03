package com.plexus.proyecto.Lostrip.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Reservas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private long alojamientoId;
	
	@JsonFormat( pattern="dd/MM/yyyy")
	private Date fechaEntrada;
	
	@JsonFormat( pattern="dd/MM/yyyy")
	private Date fechaSalida;
	
	private int personas;
	
	//Constructors
	/**
	 * 
	 */
	public Reservas() {
	}


	
	/**
	 * @param alojamientoId
	 * @param fechaEntrada
	 * @param fechaSalida
	 * @param personas
	 */
	public Reservas(long alojamientoId, Date fechaEntrada, Date fechaSalida, int personas) {
		this.alojamientoId = alojamientoId;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.personas = personas;
	}



	//Getters y setters

	/**
	 * @return the alojamientoId
	 */
	public long getAlojamientoId() {
		return alojamientoId;
	}


	/**
	 * @param alojamientoId the alojamientoId to set
	 */
	public void setAlojamientoId(long alojamientoId) {
		this.alojamientoId = alojamientoId;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/**
	 * @return the fechaEntrada
	 */
	public Date getFechaEntrada() {
		return fechaEntrada;
	}



	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}



	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}



	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}



	/**
	 * @return the personas
	 */
	public int getPersonas() {
		return personas;
	}



	/**
	 * @param personas the personas to set
	 */
	public void setPersonas(int personas) {
		this.personas = personas;
	}

	
	
	
	
}
