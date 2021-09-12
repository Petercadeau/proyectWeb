package com.modelo.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.modelo.dao.TutoriaDAO;
import com.modelo.entidad.Horario;
import com.modelo.entidad.Tutoria;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:57
 */
public class JPATutoriaDAO extends JPAGenericDAO<Tutoria, Integer> implements TutoriaDAO {

	public JPATutoriaDAO() {
		super(Tutoria.class);
	}

	public List<Tutoria> obtenerListaPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		String sentenciaJPQL = "SELECT t FROM Tutoria t WHERE t.docente.id = " + id;
		Query query = em.createQuery(sentenciaJPQL);

		List<Tutoria> tutorias = (List<Tutoria>) query.getResultList();

		return tutorias;
	}

}// end JPATutoriaDAO