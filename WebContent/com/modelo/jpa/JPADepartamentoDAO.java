package com.modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import com.modelo.dao.DepartamentoDAO;
import com.modelo.entidad.Departamento;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:55
 */
public class JPADepartamentoDAO extends JPAGenericDAO<Departamento, Integer> implements DepartamentoDAO {

	public JPADepartamentoDAO() {
		super(Departamento.class);
	}
	
	@Override
	public List<Departamento> obtener() {
		String consulta = "Select e from " + this.persistentClass.getSimpleName() + " e";
		Query query = em.createQuery(consulta, this.persistentClass);
		List<Departamento> list = (List<Departamento>) query.getResultList();
		return list;
	}

}// end JPADepartamentoDAO