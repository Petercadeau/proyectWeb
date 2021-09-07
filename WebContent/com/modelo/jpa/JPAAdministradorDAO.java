package com.modelo.jpa;

import com.modelo.dao.AdministradorDAO;
import com.modelo.entidad.*;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:53
 */
public class JPAAdministradorDAO extends JPAPersonaDAO<Administrador> implements AdministradorDAO {

	public JPAAdministradorDAO() {
		super(Administrador.class);
	}

	@Override
	public Persona autorizar(Administrador u) {
		// TODO Auto-generated method stub
		return null;
	}

}// end JPAAdministradorDAO