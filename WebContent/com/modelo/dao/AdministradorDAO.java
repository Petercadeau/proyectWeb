package com.modelo.dao;

import java.util.List;

import com.modelo.entidad.Administrador;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:25
 */
public interface AdministradorDAO  {

	public void actualizar();

	public Administrador autorizar();

	public void crear();

	public void eliminar();

	public List<Administrador> obtenerAdministradores();

	public Administrador buscarAdministrador();
}