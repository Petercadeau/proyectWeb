package com.modelo.dao;

import com.modelo.entidad.Usuario;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:04
 */
public interface UsuarioDAO extends GenericDAO {

	public Usuario autorizar();

}