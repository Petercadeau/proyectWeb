package com.modelo.entidad;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:19
 */

@Entity
@Table (name="DOCENTE")
public class Docente extends Persona {
	

	
	@ManyToOne()
	@JoinColumn(name="departamento")
	private Departamento departamento;
	
	@OneToMany(mappedBy="Persona")
	private List<Horario> horario;

	public Docente(){

	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Horario> getHorario() {
		return horario;
	}

	public void setHorario(List<Horario> horario) {
		this.horario = horario;
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

	
	
}//end Docente