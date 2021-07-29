package com.plexus.proyecto.Lostrip.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class ComentariosEx {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Lob
	private String comentario;
	
	private String userID;
	//Constructors
	/**
	 * 
	 */
	public ComentariosEx() {
	}
	/**
	 * @param comentario
	 * @param userID
	 */
	public ComentariosEx(String comentario, String userID) {
		this.comentario = comentario;
		this.userID = userID;
	}
	
	
	/**
	 * @param id
	 * @param comentario
	 * @param userID
	 */
	public ComentariosEx(long id, String comentario, String userID) {
		this.id = id;
		this.comentario = comentario;
		this.userID = userID;
	}
	
	//Getters & setters
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}	
	
	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}
	
	
	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	
	
}
