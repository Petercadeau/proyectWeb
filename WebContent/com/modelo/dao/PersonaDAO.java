package com.modelo.dao;

import com.modelo.entidad.Persona;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:04
 */
public interface PersonaDAO<T> extends GenericDAO<T, Integer> {

	public Persona autorizar(String usuario, String password);

}