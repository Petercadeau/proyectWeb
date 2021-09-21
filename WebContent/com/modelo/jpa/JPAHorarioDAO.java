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

	public JPAHorarioDAO() {
		super(Horario.class);
	}

	public List<Horario> obtenerListaPorId(Integer id) {
		String consulta = "Select h.horario from DocenteHorario h WHERE h.docente.id =" + id;
		Query query = em.createQuery(consulta);
		List<Horario> list = (List<Horario>) query.getResultList();
		System.out.println("Tamaño lista: " + list.size());
		return list;
	}

	public List<Horario> obtenerListaPorIdDia(Integer id, String dia) {

		String consulta = "Select dh.horario from DocenteHorario dh "
				+ "Where (dh.docente.id = :id) AND (dh.horario.dia=:dia) " + "and (dh.horario.idHorario not in "
				+ "(Select t.horario.idHorario from Tutoria t WHERE t.docente = dh.docente))";

		Query query = em.createQuery(consulta);
		query.setParameter("id", id);
		query.setParameter("dia", dia);
		List<Horario> list = (List<Horario>) query.getResultList();
		System.out.println("Tamaño lista: " + list.size());
		return list;
	}

	public void insertarhordep(int docenteId, int horarioId) {
		em.getTransaction().begin();
		Query query = em
				.createNativeQuery("INSERT INTO docente_horario (Docente_idPersona, horario_idHorario) VALUES (?,?)");
		query.setParameter(1, docenteId);
		query.setParameter(2, horarioId);
		query.executeUpdate();
		em.getTransaction().commit();
	}

}// end JPAHorarioDAO