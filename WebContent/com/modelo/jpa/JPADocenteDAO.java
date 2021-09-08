package com.modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.DocenteDAO;
import com.modelo.entidad.Docente;
import com.modelo.entidad.Persona;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:55
 */
public class JPADocenteDAO extends JPAPersonaDAO<Docente> implements DocenteDAO {

	public JPADocenteDAO() {
		super(Docente.class);
	}


	@Override
	public Persona autorizar(String usuario, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Docente> obtenerPorFecha(String fecha){
		String consulta = "Select * from horario h "
				+ "join docente_horario d on h.idHorario=d.horario_idHorario "
				+ "join persona p on p.idPersona=d.docente_idPersona "
				+ "where h.dia = "+fecha;
		Query query = em.createNativeQuery(consulta);
		List<Docente> list = (List<Docente>) query.getResultList();
		return list;
	}
	
}// end JPADocenteDAO