package com.modelo.jpa;

import com.modelo.dao.EstudianteDAO;
import com.modelo.entidad.Estudiante;
import com.modelo.entidad.Usuario;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:55
 */
public class JPAEstudianteDAO extends JPAUsuarioDAO<Estudiante> implements EstudianteDAO {

	public JPAEstudianteDAO() {
		super(Estudiante.class);
	}


	@Override
	public Usuario autorizar(Estudiante u) {
		// TODO Auto-generated method stub
		return null;
	}
}// end JPAEstudianteDAO