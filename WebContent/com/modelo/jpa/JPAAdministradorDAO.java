package com.modelo.jpa;

import java.util.List;

import com.modelo.dao.AdministradorDAO;
import com.modelo.entidad.*;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:53
 */
public class JPAAdministradorDAO extends JPAUsuarioDAO implements AdministradorDAO {

	public JPAAdministradorDAO() {

	}

	@Override
	public Usuario autorizar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crear(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List obtener(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object obtenerPorId(Object id) {
		// TODO Auto-generated method stub
		return null;
	}
}// end JPAAdministradorDAO