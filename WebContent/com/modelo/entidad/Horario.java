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
/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:19
 */
@Entity
@Table (name="Horario")
public class Horario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHorario")
    private Integer id;
    @Column(name = "dia")
	private String dia;
	@Column(name = "horaDefin")
	private String horaDeFin;
	@Column(name = "horaDeInicio")
	private String horaDeInicio;

	public Horario(){

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
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Horario)) {
			return false;
		}
		Horario other = (Horario) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
	
	
}//end Horario