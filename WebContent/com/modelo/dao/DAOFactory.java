package com.modelo.dao;

import com.modelo.entidad.Persona;
import com.modelo.jpa.JPADAOFactory;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:51
 */
public abstract class DAOFactory {

	public static DAOFactory m_DAOFactory = new JPADAOFactory();

	public static DAOFactory getFactory() {
		return m_DAOFactory;
	}

	public DAOFactory() {

	}

	public abstract AdministradorDAO getAdministradorDAO();

	public abstract DepartamentoDAO getDepartamentoDAO();

	public abstract DocenteDAO getDocenteDAO();

	public abstract EstudianteDAO getEstudianteDAO();

	public abstract HorarioDAO getHorarioDAO();

	public abstract TuroriaDAO getTutoriaDAO();

	public abstract PersonaDAO<Persona> getPersonaDAO();
}// end DAOFactory