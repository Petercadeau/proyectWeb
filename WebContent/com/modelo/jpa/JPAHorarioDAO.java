package com.modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.HorarioDAO;
import com.modelo.entidad.Horario;
import com.modelo.entidad.Tutoria;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:57
 */
public class JPAHorarioDAO extends JPAGenericDAO<Horario, Integer> implements HorarioDAO {

	public JPAHorarioDAO(){
		super(Horario.class);
	}

	@Override
	public List<Horario> obtenerPorId(Integer id) {
		String consulta = "Select * from horario h "
				+ "join docente_horario d on h.idHorario=d.horario_idHorario "
				+ "where d.docente_idPersona = "+id;
		Query query = em.createNativeQuery(consulta);
		List<Horario> list = (List<Horario>) query.getResultList();
		return list;
	}

	

}//end JPAHorarioDAO