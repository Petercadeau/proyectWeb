package com.modelo.dao;

import java.util.List;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:16:10
 */
public interface GenericDAO<T,ID> {

	/**
	 * 
	 * @param entity
	 */
	public void actualizar(T entity);

	/**
	 * 
	 * @param entity
	 */
	public void crear(T entity);

	/**
	 * 
	 * @param id
	 */
	public void eliminar(ID id);

	/**
	 * 
	 * @param entity
	 */
	public List<T> obtener();

	/**
	 * 
	 * @param id
	 */
	public T obtenerPorId(ID id);
	
}