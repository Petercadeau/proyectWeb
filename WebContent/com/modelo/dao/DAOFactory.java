package com.modelo.dao;



/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:51
 */
public abstract class DAOFactory {

	public DAOFactory m_DAOFactory;

	public DAOFactory() {

	}

	public void finalize() throws Throwable {

	}

	public AdministradorDAO getAdministradorDAO() {
		return null;
	}

	public DepartamentoDAO getDepartamentoDAO() {
		return null;
	}

	public DocenteDAO getDocenteDAO() {
		return null;
	}

	public EstudianteDAO getEstudianteDAO() {
		return null;
	}

	public static DAOFactory getFactory() {
		return null;
	}

	public HorarioDAO getHorarioDAO() {
		return null;
	}

	public TuroriaDAO getTutoriaDAO() {
		return null;
	}

	public UsuarioDAO getUsuarioDAO() {
		return null;
	}
}// end DAOFactory