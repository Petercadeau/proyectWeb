package com.modelo.dao;

import java.util.List;

import com.modelo.entidad.Estudiante;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:25
 */
public interface EstudianteDAO {

	public void actualizar();

	public void autorizar();

	public void crear();

	public void eliminar();

	public List<Estudiante> obtenerEstudiantes();

	public Estudiante buscarEstudiante();
}