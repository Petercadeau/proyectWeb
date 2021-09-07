package com.modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.PersonaDAO;
import com.modelo.entidad.Persona;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:04
 */
public class JPAPersonaDAO<T> extends JPAGenericDAO<T, Integer> implements PersonaDAO<T> {

	public JPAPersonaDAO(Class<T> persitentClass) {
		super(persitentClass);
	}



	@Override
	public Persona autorizar(String cedula, String password) {
		String sentenciaJPQL = "SELECT e FROM Persona e WHERE e.cedula= :cedula AND e.clave= :password";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("cedula", cedula);
		query.setParameter("password", password);
		
		List w=query.getResultList();
		if(w.isEmpty()) {
			System.out.println(w+" "+w.toString());
			return null;
		}
		
		Persona personaEncontrada = (Persona) w.get(0);
		return personaEncontrada;
	}
}// end JPAUsuarioDAO