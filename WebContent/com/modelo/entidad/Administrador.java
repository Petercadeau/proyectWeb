package com.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:19
 */

@Entity
@Table (name="ADMINISTRADOR")
public class Administrador extends Persona {

	
	
	
	
	public Administrador() {

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

}// end Administrador