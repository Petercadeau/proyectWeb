package com.modelo.dao;

import java.util.List;

import com.modelo.entidad.Docente;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:03
 */
public interface DocenteDAO extends PersonaDAO<Docente> {

	public abstract List<Docente> obtenerPorFecha(String fecha);
}