package com.modelo.entidad;

<<<<<<< Updated upstream
import java.io.Serializable;
=======
>>>>>>> Stashed changes
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
<<<<<<< Updated upstream
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
=======
import javax.persistence.Table;

>>>>>>> Stashed changes

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:19
 */

<<<<<<< Updated upstream
=======
@Entity
@Table (name="ESTUDIANTE")
>>>>>>> Stashed changes
public class Estudiante extends Persona {
	
	

	

	
	public Estudiante(){

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

	
}//end Estudiante