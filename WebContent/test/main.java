package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.modelo.entidad.Docente;
import com.modelo.entidad.Persona;

public class main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect1.0");
		EntityManager em = emf.createEntityManager();

		Persona p = new Docente();
		p.setCedula("17598642450");
		p.setNombre("PeterK");
		

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}
}
