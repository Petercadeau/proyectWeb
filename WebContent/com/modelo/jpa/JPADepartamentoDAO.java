package com.modelo.jpa;

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

}// end JPADepartamentoDAO