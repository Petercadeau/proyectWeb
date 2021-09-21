package com.modelo.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DocenteHorario
 *
 */
@Entity
@Table(name = "docente_horario")
//@IdClass(DocenteHorario.class)
public class DocenteHorario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDocenteHorario")
	Integer idDocenteHorario;
	
	
	//@Column(name="docente", insertable = false, updatable = false)
	@JoinColumn(name = "docente")
	
	Docente docente;
	
	
	//@Column(name="horario", insertable = false, updatable = false)
	@JoinColumn(name = "horario")
	
	Horario horario;

	public DocenteHorario() {
		super();
	}
	
	
	
	public Integer getIdDocenteHorario() {
		return idDocenteHorario;
	}



	public void setIdDocenteHorario(Integer idDocenteHorario) {
		this.idDocenteHorario = idDocenteHorario;
	}



	public Docente getDocente() {
		return docente;
	}



	public void setDocente(Docente docente) {
		this.docente = docente;
	}



	


	public Horario getHorario() {
		return horario;
	}



	public void setHorario(Horario horario) {
		this.horario = horario;
	}



	@Override
	public int hashCode() {
		int hash = 0;
		hash += (docente != null ? docente.hashCode() : 0);
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
		Docente other = (Docente) object;
		if ((this.docente.getId() == null && other.getId() != null)
				|| (this.docente.getId() != null && !this.docente.equals(other.getId()))) {
			return false;
		}
		return true;
	}
   
}
