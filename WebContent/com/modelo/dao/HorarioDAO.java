package com.modelo.dao;

import java.util.List;


import com.modelo.entidad.Horario;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:25
 */
public interface HorarioDAO{

	public void actualizar();

	public void crear();

	public void eliminar();

	public List<Horario> obtenerHorarios();

	public List<Horario> buscarHorarios(String cedula);
}