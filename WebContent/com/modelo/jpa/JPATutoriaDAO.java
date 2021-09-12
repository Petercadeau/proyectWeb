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
		String sentenciaJPQL = "SELECT t FROM Tutoria t ";
		Query query = em.createQuery(sentenciaJPQL);
		
		List<Tutoria> todas = (List<Tutoria>) query.getResultList();
		List<Tutoria> tutorias = new ArrayList<>();

		for(int i=0;i<todas.size();i++) {
			if(todas.get(i).getDocente().getId()==id) {
				tutorias.add(todas.get(i));
				//System.out.println("Entro en el if"+i);
			}	
		}
		
		tutorias=(List<Tutoria>) tutorias;
		
		return tutorias;
	}
	
}// end JPATutoriaDAO