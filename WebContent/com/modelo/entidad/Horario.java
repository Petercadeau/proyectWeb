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
@Table(name = "horario")
public class Horario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHorario")
	private Integer idHorario;
	@Column(name = "dia")
	private String dia;
	@Column(name = "horaDisponibleFin")
	private String horaDeFin;
	@Column(name = "horaDisponibleInicio")
	private String horaDeInicio;

	public Horario() {

	}
	
	

	public Horario(String dia, String horaDeFin, String horaDeInicio) {
		super();
		this.dia = dia;
		this.horaDeFin = horaDeFin;
		this.horaDeInicio = horaDeInicio;
	}

	
	


	public Integer getIdHorario() {
		return idHorario;
	}



	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}



	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHoraDeFin() {
		return horaDeFin;
	}

	public void setHoraDeFin(String horaDeFin) {
		this.horaDeFin = horaDeFin;
	}

	public String getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(String horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idHorario != null ? idHorario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Persona)) {
			return false;
		}
		Horario other = (Horario) object;
		if ((this.idHorario == null && other.idHorario != null)
				|| (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
			return false;
		}
		return true;
	}

}// end Horario