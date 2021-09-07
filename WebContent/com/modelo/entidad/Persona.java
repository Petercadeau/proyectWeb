package com.modelo.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import javax.persistence.OneToOne;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:20
 */

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(
	    discriminatorType = DiscriminatorType.STRING,
	    name = "tipoDeUsuario",
	    columnDefinition = "Varchar(15)"
	)
public abstract class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersona")
	private Integer id;

	@Column(name = "cedulaPersona")
	protected String cedula;

	@Column(name = "nombrePersona")
	protected String nombre;

	@Column(name = "clavePersona")
	protected String clave;

	//0,1,2 Admin, Docente, Estudiante
	@Column(name="tipoDeUsuario", insertable = false, updatable = false)
	protected String tipoDeUsuario;

	public Persona() {

	}
	

	public Persona(String cedula, String clave) {
		this.cedula = cedula;
		this.clave = clave;
	}
	
	


	public String getTipoDeUsuario() {
		return tipoDeUsuario;
	}


	public void setTipoDeUsuario(String tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
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

}
// end Persona