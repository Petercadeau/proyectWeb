package com.modelo.jpa;

import com.modelo.dao.EstudianteDAO;
import com.modelo.entidad.Usuario;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:55
 */
public class JPAEstudianteDAO extends JPAUsuarioDAO implements EstudianteDAO {

	public JPAEstudianteDAO(){

	}


	public Usuario autorizar(){
		return null;
	}


	@Override
	public Usuario autorizar(Usuario u) {
		// TODO Auto-generated method stub
		return null;
	}
}//end JPAEstudianteDAO