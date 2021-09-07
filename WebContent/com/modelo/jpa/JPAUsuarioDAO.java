package com.modelo.jpa;

import com.modelo.dao.PersonaDAO;
import com.modelo.entidad.Usuario;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:04
 */
public class JPAUsuarioDAO<T> extends JPAGenericDAO<T, Integer> implements PersonaDAO<T> {

	public JPAUsuarioDAO(Class<T> persitentClass) {
		super(persitentClass);
	}



	@Override
	public Usuario autorizar(T u) {
		return (Usuario) u;
	}
}// end JPAUsuarioDAO