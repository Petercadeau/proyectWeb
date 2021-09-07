package com.modelo.jpa;

import com.modelo.dao.EstudianteDAO;
import com.modelo.entidad.Estudiante;
import com.modelo.entidad.Persona;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:55
 */
public class JPAEstudianteDAO extends JPAPersonaDAO<Estudiante> implements EstudianteDAO {

	public JPAEstudianteDAO() {
		super(Estudiante.class);
	}


	@Override
	public Persona autorizar(Estudiante u) {
		// TODO Auto-generated method stub
		return null;
	}
}// end JPAEstudianteDAO