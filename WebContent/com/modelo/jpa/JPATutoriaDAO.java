package com.modelo.jpa;

import com.modelo.dao.TuroriaDAO;
import com.modelo.entidad.Tutoria;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:57
 */
public class JPATutoriaDAO extends JPAGenericDAO<Tutoria, Integer> implements TuroriaDAO {

	public JPATutoriaDAO() {
		super(Tutoria.class);
	}

}// end JPATutoriaDAO