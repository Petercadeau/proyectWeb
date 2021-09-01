package com.modelo.jpa;

import java.util.List;

import com.modelo.dao.GenericDAO;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:57
 */
public class JPAGenericDAO<T, ID> implements GenericDAO {

	public JPAGenericDAO(Class<T> persitentClass) {

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
}// end JPAGenericDAO<T,ID>