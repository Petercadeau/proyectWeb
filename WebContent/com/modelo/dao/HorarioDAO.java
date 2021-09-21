package com.modelo.dao;

import java.util.List;

import com.modelo.entidad.Horario;
import com.modelo.entidad.Tutoria;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:04
 */
public interface HorarioDAO extends GenericDAO<Horario, Integer> {

	public abstract List<Horario> obtenerListaPorId(Integer id);

	public abstract List<Horario> obtenerListaPorIdDia(Integer txtId, String txtDia);
	
}