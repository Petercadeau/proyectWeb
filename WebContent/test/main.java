package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.dao.PersonaDAO;
import com.modelo.entidad.Administrador;
import com.modelo.entidad.Departamento;
import com.modelo.entidad.Docente;
import com.modelo.entidad.Estudiante;
import com.modelo.entidad.Persona;

public class main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect1.0");
		EntityManager em = emf.createEntityManager();

		/*Persona p = new Administrador();
		p.setCedula("17598642450");
		p.setNombre("Admin PeterK");
		p.setClave("33");*/
		
		/*Departamento dep = new Departamento();
		dep.setEdificio("ICB");
		dep.setNombre("Formación Básica");
		

		em.getTransaction().begin();
		em.persist(dep);
		em.getTransaction().commit();*/
		
		
		DepartamentoDAO p = DAOFactory.getFactory().getDepartamentoDAO();
		List<Departamento> personas = p.obtener();
		System.out.println(personas.toString());
	}
}
