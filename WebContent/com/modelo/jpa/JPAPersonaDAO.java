package com.modelo.jpa;

import com.modelo.dao.PersonaDAO;
import com.modelo.entidad.Persona;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:04
 */
public class JPAPersonaDAO<T> extends JPAGenericDAO<T, Integer> implements PersonaDAO<T> {

	public JPAPersonaDAO(Class<T> persitentClass) {
		super(persitentClass);
	}



	@Override
	public Persona autorizar(T u) {
		return (Persona) u;
	}
}// end JPAUsuarioDAO