package com.plexus.proyecto.Lostrip.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.plexus.proyecto.Lostrip.Enum.Genero;
import com.plexus.proyecto.Lostrip.Enum.Rol;

@Entity
public class Usuario {

	@Id
	private String userID;
	
	private String nombre;
	
	private String apellidos;
	
	private String email;
	
	private String nick;
	
	@JsonFormat( pattern="dd/MM/yyyy")
	private Date fechaNacimiento;
	
	private Rol usuarioRol;
	
	private int telefono;
	
	private String fotoPerfil;
	
	private String nacionalidad;
	
	private Genero genero;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Reservas> reservas = new ArrayList<Reservas>();
	
	/**
	 * 
	 */
	public Usuario() {
	}

	/**
	 * @param userID
	 * @param nombre
	 * @param email
	 * @param usuarioRol
	 * @param fotoPerfil
	 */
	public Usuario(String userID, String nombre, String email, Rol usuarioRol, String fotoPerfil) {
		this.userID = userID;
		this.nombre = nombre;
		this.email = email;
		this.usuarioRol = usuarioRol;
		this.fotoPerfil = fotoPerfil;
	}
	
	

	/**
	 * @param userID
	 * @param nombre
	 * @param apellidos
	 * @param email
	 * @param usuarioRol
	 * @param fotoPerfil
	 */
	public Usuario(String userID, String nombre, String apellidos, String email, Rol usuarioRol, String fotoPerfil) {
		this.userID = userID;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.usuarioRol = usuarioRol;
		this.fotoPerfil = fotoPerfil;
	}
	
	

	/**
	 * @param userID
	 * @param nombre
	 * @param apellidos
	 * @param email
	 * @param nick
	 * @param usuarioRol
	 * @param fotoPerfil
	 */
	public Usuario(String userID, String nombre, String apellidos, String email, String nick, Rol usuarioRol,
			String fotoPerfil) {
		this.userID = userID;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.nick = nick;
		this.usuarioRol = usuarioRol;
		this.fotoPerfil = fotoPerfil;
	}

	
	/**
	 * @param userID
	 * @param nombre
	 * @param email
	 * @param usuarioRol
	 * @param fotoPerfil
	 * @param nacionalidad
	 */
	public Usuario(String userID, String nombre, String email, Rol usuarioRol, String fotoPerfil, String nacionalidad) {
		this.userID = userID;
		this.nombre = nombre;
		this.email = email;
		this.usuarioRol = usuarioRol;
		this.fotoPerfil = fotoPerfil;
		this.nacionalidad = nacionalidad;
	}

	/**
	 * @param userID
	 * @param nombre
	 * @param email
	 * @param usuarioRol
	 * @param fotoPerfil
	 * @param genero
	 */
	public Usuario(String userID, String nombre, String email, Rol usuarioRol, String fotoPerfil, Genero genero) {
		this.userID = userID;
		this.nombre = nombre;
		this.email = email;
		this.usuarioRol = usuarioRol;
		this.fotoPerfil = fotoPerfil;
		this.genero = genero;
	}
	
	

	/**
	 * @param userID
	 * @param nombre
	 * @param email
	 * @param fechaNacimiento
	 * @param usuarioRol
	 * @param fotoPerfil
	 */
	public Usuario(String userID, String nombre, String email, Date fechaNacimiento, Rol usuarioRol,
			String fotoPerfil) {
		this.userID = userID;
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.usuarioRol = usuarioRol;
		this.fotoPerfil = fotoPerfil;
	}

	
	
	/**
	 * @param userID
	 * @param nombre
	 * @param email
	 * @param usuarioRol
	 * @param telefono
	 * @param fotoPerfil
	 */
	public Usuario(String userID, String nombre, String email, Rol usuarioRol, int telefono, String fotoPerfil) {
		this.userID = userID;
		this.nombre = nombre;
		this.email = email;
		this.usuarioRol = usuarioRol;
		this.telefono = telefono;
		this.fotoPerfil = fotoPerfil;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the usuarioRol
	 */
	public Rol getUsuarioRol() {
		return usuarioRol;
	}

	/**
	 * @param usuarioRol the usuarioRol to set
	 */
	public void setUsuarioRol(Rol usuarioRol) {
		this.usuarioRol = usuarioRol;
	}

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the fotoPerfil
	 */
	public String getFotoPerfil() {
		return fotoPerfil;
	}

	/**
	 * @param fotoPerfil the fotoPerfil to set
	 */
	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	/**
	 * @return the reservas
	 */
	public List<Reservas> getReservas() {
		return reservas;
	}

	//Helpers
	public void addReserva(Reservas reserva) {
		reservas.add(reserva);
	}
	public void deleteReserva(Reservas reserva) {
		reservas.remove(reserva);
	}
}
