package com.modelo.entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:19
 */
@Entity
@Table(name = "departamento")
public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDepartamento")
	private Integer idDepartamento;
	@Column(name = "edificio")
	private String edificio;
	@Column(name = "nombre")
	private String nombre;

	public Departamento() {

	}

	public Departamento(String nombre, String edificio) {
		this.nombre=nombre;
		this.edificio=edificio;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idDepartamento != null ? idDepartamento.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the idDepartamentofields
		// are
		// not set
		if (!(object instanceof Persona)) {
			return false;
		}
		Departamento other = (Departamento) object;
		if ((this.idDepartamento == null && other.idDepartamento != null)
				|| (this.idDepartamento != null && !this.idDepartamento.equals(other.idDepartamento))) {
			return false;
		}
		return true;
	}

}// end Departamento