package com.modelo.entidad;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Table;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:19
 */

@Entity

public class Estudiante extends Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Estudiante() {
		super();
	}

	public Estudiante(String cedula, String nombre, String apellido, String clave) {
		super(cedula,nombre,apellido,clave);
		
	}

	@Override
	public String getCedula() {
		// TODO Auto-generated method stub
		return super.getCedula();
	}

	@Override
	public void setCedula(String cedula) {
		// TODO Auto-generated method stub
		super.setCedula(cedula);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

}// end Estudiante