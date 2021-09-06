package com.modelo.entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.modelo.entidades.Persona;



/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:20
 */
@Entity
@Table (name="USUARIOS")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "clave")
	private String clave;
	private Persona persona;
	@Column(name = "rol")
	private String tipoUsuario;

	public Usuario(){

	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
	
	
	
}//end Usuario