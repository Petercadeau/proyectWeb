package com.modelo.entidad;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:20
 */

@Entity
@Table (name="Tutoria")
public class Tutoria implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Tutoria")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "docente")
	private Docente docente;
	@ManyToOne
	@JoinColumn(name = "estudiante")
	private Estudiante estudiante;
	@ManyToOne
	@JoinColumn(name = "horario")
	private Horario horario;

	private static final long serialVersionUID = 1L;
	
	public Tutoria(){

	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
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
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Tutoria)) {
			return false;
		}
		Tutoria other = (Tutoria) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}
	
	

	
	
}//end Tutoria