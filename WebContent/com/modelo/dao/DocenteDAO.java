package com.modelo.dao;

import java.util.List;

import com.modelo.entidad.Docente;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:25
 */
public interface DocenteDAO {

	public void actualizar();

	public Docente autorizar();

	public void crear();

	public void eliminar();

	public List<Docente> obtenerDocentes();
	
	public Docente buscarDocente(String cedula);

}