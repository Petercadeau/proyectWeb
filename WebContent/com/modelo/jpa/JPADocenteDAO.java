package com.modelo.jpa;

import com.modelo.dao.DocenteDAO;
import com.modelo.entidad.Docente;
import com.modelo.entidad.Persona;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:55
 */
public class JPADocenteDAO extends JPAPersonaDAO<Docente> implements DocenteDAO {

	public JPADocenteDAO() {
		super(Docente.class);
	}


	@Override
	public Persona autorizar(String usuario, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}// end JPADocenteDAO