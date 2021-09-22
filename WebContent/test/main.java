package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.modelo.dao.GenericDAO;
import com.modelo.entidad.Tutoria;
import com.modelo.jpa.JPAHorarioDAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.modelo.dao.AdministradorDAO;
import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.dao.DocenteDAO;
import com.modelo.dao.EstudianteDAO;
import com.modelo.dao.HorarioDAO;
import com.modelo.dao.PersonaDAO;
import com.modelo.entidad.Administrador;
import com.modelo.entidad.Departamento;
import com.modelo.entidad.Docente;
import com.modelo.entidad.DocenteHorario;
import com.modelo.entidad.Estudiante;
import com.modelo.entidad.Horario;
import com.modelo.entidad.Persona;

public class main {
	public static void main(String[] args) {
		/*
		Horario horario = new Horario("Martes", "7:00", "7:15");

		Horario horario1 = new Horario("Miercoles", "7:00", "7:15");

		Administrador d = new Administrador("1717171717", "J", "P", "123");

		Docente docente = new Docente("1234567890", "Devid", "Morales", "1234");

		Estudiante estudiante = new Estudiante("1919191919", "Davi", "M", "789");

		Departamento depa = new Departamento("ccss", "101");
		DepartamentoDAO depDao = DAOFactory.getFactory().getDepartamentoDAO();
		depDao.crear(depa);

		docente.setDepartamento(depa);
		
		DAOFactory.getFactory().getHorarioDAO().crear(horario);
		
		DocenteHorario dh = new DocenteHorario();
		dh.setDocente(docente);
		dh.setHorario(horario);
		
		DAOFactory.getFactory().getDocenteDAO().crear(docente);
		

		//docente.setHorario(h);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect1.0");
		EntityManager em = emf.createEntityManager();
		//docente.getHorario().remove(horario);

		em.getTransaction().begin();
		em.persist(dh);
		em.getTransaction().commit();
		*/
		
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect1.0");
		EntityManager em = emf.createEntityManager();*/
		
	
		//Obtener los docentes disponible en un día 
		/*String consulta="Select distinct dh.docente from DocenteHorario dh "
				+ "Where (dh.horario.dia='Martes') "
				+ "and (dh.horario.idHorario not in "
				+ "(Select t.horario.idHorario from Tutoria t WHERE t.docente = dh.docente))";
		em.getTransaction().begin();
		Query cueri=em.createQuery(consulta);
		List <Docente> docentes=cueri.getResultList();
		em.getTransaction().commit();
		System.out.println(docentes.get(0).getApellido());
		System.out.println(docentes.size());
		System.out.println(docentes.get(1).getApellido());*/
	
		
		/*//Obtener los Horarios disponibles de un docente en un día
		String consulta="Select dh.horario from DocenteHorario dh "
				+ "Where (dh.docente.id = '2') AND (dh.horario.dia='Martes') "
				+ "and (dh.horario.idHorario not in "
				+ "(Select t.horario.idHorario from Tutoria t WHERE t.docente = dh.docente))";
		em.getTransaction().begin();
		Query cueri=em.createQuery(consulta);
		List <Horario> docentes=cueri.getResultList();
		em.getTransaction().commit();
		System.out.println(docentes.get(0).getHoraDeFin());
		System.out.println(docentes.size());
		System.out.println(docentes.get(1).getHoraDeInicio());*/
		
		/*Administrador d = new Administrador("1717171717", "J", "P", "123");

		DAOFactory.getFactory().getAdministradorDAO().crear(d);*/
		
		String dia ="Viernes";
		String FranjaHoraria = "10:00";
		
		DocenteHorario docenteHorario = new DocenteHorario();
		
		JPAHorarioDAO horariodao = (JPAHorarioDAO) DAOFactory.getFactory().getHorarioDAO();
		Horario horario = 	horariodao.getHorarioByDiaHora(dia, FranjaHoraria);;
		
		System.out.println(horario.toString());

	}
}
