package com.modelo.jpa;

import java.util.List;

import com.modelo.dao.GenericDAO;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:57
 */
public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID> {

	public JPAGenericDAO(Class<T> persitentClass) {

	}

	@Override
	public void actualizar(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crear(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(ID id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List obtener(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T obtenerPorId(ID id) {
		// TODO Auto-generated method stub
		return null;
	}
}// end JPAGenericDAO<T,ID>