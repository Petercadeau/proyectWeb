package com.modelo.entidad;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:20
 */
public abstract class Persona {

	protected String cedula;
	protected String nombre;

	public Persona() {

	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}// end Persona