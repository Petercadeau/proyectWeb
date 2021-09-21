package com.modelo.jpa;

import com.modelo.dao.DocenteHorarioDAO;
import com.modelo.entidad.DocenteHorario;

public class JPADocenteHorarioDAO extends JPAGenericDAO<DocenteHorario, Integer> implements DocenteHorarioDAO {

	public JPADocenteHorarioDAO() {
		super(DocenteHorario.class);	
	}

}
