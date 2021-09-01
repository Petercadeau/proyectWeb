package com.modelo.jpa;

import com.modelo.dao.HorarioDAO;
import com.modelo.entidad.Horario;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:57
 */
public class JPAHorarioDAO extends JPAGenericDAO<Horario,Integer> implements HorarioDAO {

	public JPAHorarioDAO(){
		super(Horario.class);
	}


}//end JPAHorarioDAO