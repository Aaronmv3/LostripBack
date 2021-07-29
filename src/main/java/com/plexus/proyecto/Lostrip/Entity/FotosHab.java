package com.plexus.proyecto.Lostrip.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class FotosHab {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String url;
	private String imagenId;
	
	// Constructors
	
	/**
	 * 
	 */
	public FotosHab() {
	}
	
	/**
	 * @param url
	 */
	public FotosHab(String url, String imagenId) {
		this.url = url;
		this.imagenId = imagenId;
	}

	// Getters & setters
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the imagenId
	 */
	public String getImagenId() {
		return imagenId;
	}

	/**
	 * @param imagenId the imagenId to set
	 */
	public void setImagenId(String imagenId) {
		this.imagenId = imagenId;
	}
	
}
