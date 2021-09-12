package com.modelo.jpa;

import java.util.ArrayList;
import java.util.List;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DocenteDAO;
import com.modelo.dao.TutoriaDAO;
import com.modelo.entidad.Docente;
import com.modelo.entidad.Horario;
import com.modelo.entidad.Persona;
import com.modelo.entidad.Tutoria;

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

	private boolean buscarPorIdEnListaHorario(List<Tutoria> tutorias, Integer id) {
		for (Tutoria tuto : tutorias) {
			if (tuto.getHorario().getIdHorario().equals(id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Docente> obtenerPorFecha(String fecha) {
		List<Docente> lista = obtener();
		List<Docente> listaRetorno = new ArrayList<Docente>();

		TutoriaDAO tutoriaDAO = DAOFactory.getFactory().getTutoriaDAO();
		List<Tutoria> tutorias = tutoriaDAO.obtener();

		for (Docente docente : lista) {
			ArrayList<Horario> horarioDelDocente = new ArrayList<Horario>();
			for (Horario horarioFraccion : docente.getHorario()) {
				if (horarioFraccion.getDia().equals(fecha)) {
					if (!buscarPorIdEnListaHorario(tutorias, horarioFraccion.getIdHorario())) {
						horarioDelDocente.add(horarioFraccion);
					}
				}
			}
			if (!horarioDelDocente.isEmpty()) {
				docente.setHorario(horarioDelDocente);
				listaRetorno.add(docente);
			}
		}

		return listaRetorno;
	}


	
	
	

}// end JPADocenteDAO