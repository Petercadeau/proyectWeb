package com.modelo.jpa;

import com.modelo.dao.AdministradorDAO;
import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.dao.DocenteDAO;
import com.modelo.dao.EstudianteDAO;
import com.modelo.dao.HorarioDAO;
import com.modelo.dao.TuroriaDAO;
import com.modelo.dao.PersonaDAO;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:55
 */
public class JPADAOFactory extends DAOFactory {

	public JPADAOFactory(){

	}

	public AdministradorDAO getAdministradorDAO(){
		return new JPAAdministradorDAO();
	}

	public DepartamentoDAO getDepartamentoDAO(){
		return new JPADepartamentoDAO();
	}

	public DocenteDAO getDocenteDAO(){
		return new JPADocenteDAO();
	}

	public EstudianteDAO getEstudianteDAO(){
		return new JPAEstudianteDAO();
	}

	public HorarioDAO getHorarioDAO(){
		return new JPAHorarioDAO();
	}

	public TuroriaDAO getTutoriaDAO(){
		return new JPATutoriaDAO();
	}

	public PersonaDAO<Object> getUsuarioDAO(){
		return new JPAUsuarioDAO<Object>(null);
	}
}//end JPADAOFactory