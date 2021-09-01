package com.modelo.jpa;

import com.modelo.entidad.Usuario;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:04
 */
public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> {

	public JPAUsuarioDAO() {
		super(Usuario.class);
	}

	public Usuario autorizar() {
		return null;
	}
}// end JPAUsuarioDAO