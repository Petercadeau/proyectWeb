package com.modelo.entidad;

<<<<<<< Updated upstream
import java.io.Serializable;
=======
>>>>>>> Stashed changes
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< Updated upstream
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.modelo.entidades.Persona;


=======
import javax.persistence.OneToOne;
import javax.persistence.Table;

>>>>>>> Stashed changes
/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:20
 */
<<<<<<< Updated upstream

public abstract class Persona{
	
	protected String cedula;
	
=======
@Entity
@Table(name="PERSONA")
public abstract class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPersona")
	private Integer id;
	
	@Column(name="cedulaPersona")
	protected String cedula;
	
	@Column(name="nombrePersona")
>>>>>>> Stashed changes
	protected String nombre;
	
	@OneToOne(mappedBy="Persona")
	protected Usuario usuario;

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