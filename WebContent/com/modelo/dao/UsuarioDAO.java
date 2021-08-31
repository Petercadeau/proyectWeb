package com.modelo.dao;

import java.util.List;

import com.modelo.entidad.Usuario;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:25
 */
public interface UsuarioDAO {

	public void actualizar();

	public Usuario autorizar();

	public void crear();

	public void eliminar();

	public void obtener();

	public List<Usuario> obtenerUsuarios();
	
	public Usuario buscarUsuario(String cedula);

}