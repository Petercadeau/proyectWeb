package com.modelo.jpa;

import com.modelo.dao.AdministradorDAO;
import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.dao.DocenteDAO;
import com.modelo.dao.EstudianteDAO;
import com.modelo.dao.HorarioDAO;
import com.modelo.dao.TuroriaDAO;
import com.modelo.dao.UsuarioDAO;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:55
 */
public class JPADAOFactory extends DAOFactory {

	public JPADAOFactory(){

	}

	public AdministradorDAO getAdministradorDAO(){
		return null;
	}

	public DepartamentoDAO getDepartamentoDAO(){
		return null;
	}

	public DocenteDAO getDocenteDAO(){
		return null;
	}

	public EstudianteDAO getEstudianteDAO(){
		return null;
	}

	public HorarioDAO getHorarioDAO(){
		return null;
	}

	public TuroriaDAO getTutoriaDAO(){
		return null;
	}

	public UsuarioDAO getUsuarioDAO(){
		return null;
	}
}//end JPADAOFactory