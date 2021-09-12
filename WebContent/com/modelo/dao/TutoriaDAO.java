package com.modelo.dao;

import java.util.List;

import com.modelo.entidad.Tutoria;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:04
 */
public interface TutoriaDAO extends GenericDAO<Tutoria, Integer> {

	
	public abstract List<Tutoria> obtenerListaPorId(Integer id);

	


}