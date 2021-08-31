package com.modelo.entidad;


/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:20
 */
public class Tutoria {

	private Docente docente;
	private Estudiante estudiante;
	private Horario horario;

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

	
	
}//end Tutoria