package com.modelo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.modelo.dao.GenericDAO;
import com.modelo.entidad.Tutoria;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:03:57
 */
public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID> {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect1.0");
	protected EntityManager em = emf.createEntityManager();
	protected Class<T> persistentClass;

	public JPAGenericDAO(Class<T> persitentClass) {
		this.persistentClass = persitentClass;
	}

	@Override
	public void actualizar(T entity) {
		em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
	}

	@Override
	public void crear(T entity) {
		em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();

	}

	@Override
	public void eliminar(ID id) {
		T entity = obtenerPorId(id);
		em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
	}

	@Override
	public List<T> obtener() {
		String consulta = "Select e from " + this.persistentClass.getSimpleName() + " e";
		Query query = em.createQuery(consulta, this.persistentClass);
		List<T> list = (List<T>) query.getResultList();
		return list;
	}

	@Override
	public T obtenerPorId(ID id) {
		return  em.find(persistentClass, id);
	}

}// end JPAGenericDAO<T,ID>