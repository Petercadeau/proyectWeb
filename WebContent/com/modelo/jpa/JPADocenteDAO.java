package com.modelo.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DocenteDAO;
import com.modelo.dao.TutoriaDAO;
import com.modelo.entidad.Docente;
import com.modelo.entidad.DocenteHorario;
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

		String consulta = "Select distinct dh.docente from DocenteHorario dh " + "Where (dh.horario.dia=:fecha) "
				+ "and (dh.horario.idHorario not in "
				+ "(Select t.horario.idHorario from Tutoria t WHERE t.docente = dh.docente))";
		em.getTransaction().begin();
		Query query = em.createQuery(consulta);
		query.setParameter("fecha", fecha);
		List<Docente> docentes = query.getResultList();
		em.getTransaction().commit();
		return docentes;
	}

}// end JPADocenteDAO