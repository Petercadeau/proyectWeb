package com.modelo.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.DocenteDAO;
import com.modelo.entidad.Docente;
import com.modelo.entidad.Horario;
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
		List<Docente> lista=obtener();
		List<Docente> listaRetorno = new ArrayList<Docente>();
		
		for (Docente docente : lista) {
			for (Horario horarioFraccion : docente.getHorario()) {
				if(horarioFraccion.getDia().equals(fecha)) {
					listaRetorno.add(docente);
				}
			}
		}

		return listaRetorno;
	}
	
}// end JPADocenteDAO