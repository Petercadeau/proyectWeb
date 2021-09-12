package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.modelo.dao.GenericDAO;
import com.modelo.entidad.Tutoria;

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
import com.modelo.entidad.Estudiante;
import com.modelo.entidad.Horario;
import com.modelo.entidad.Persona;

public class main {
	public static void main(String[] args) {
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect1.0");
		EntityManager em = emf.createEntityManager();

		Horario horario = new Horario("Martes", "7:00", "7:15");

		HorarioDAO horariodao = DAOFactory.getFactory().getHorarioDAO();
		horariodao.crear(horario);

		Administrador d = new Administrador("1717171717", "J", "P", "123");

		Docente docente = new Docente("1234567890", "Devid", "Morales", "1234");

		Estudiante estudiante = new Estudiante("1919191919", "Davi", "M", "789");

		ArrayList<Horario> t = new ArrayList<Horario>();
		t.add(horario);
	

		Departamento depa = new Departamento("ccss", "101");
		DepartamentoDAO depDao = DAOFactory.getFactory().getDepartamentoDAO();
		depDao.crear(depa);

		docente.setDepartamento(depa);
		List<Horario> h = new ArrayList<Horario>();
		h.add(horario);
		docente.setHorario(h);

		DocenteDAO dc = DAOFactory.getFactory().getDocenteDAO();
		dc.crear(docente);*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect1.0");
		EntityManager em = emf.createEntityManager();
		String sentenciaJPQL = "SELECT t FROM Tutoria t";
		Query query = em.createQuery(sentenciaJPQL);
		
		List<Tutoria> personaEncontrada = (List<Tutoria>) query.getResultList();
		System.out.println(personaEncontrada.get(0).getDocente().getNombre());
		System.out.println(personaEncontrada.get(0).getDocente().getApellido());
		
		System.out.println(personaEncontrada.get(0).getEstudiante().getNombre());
		System.out.println(personaEncontrada.get(0).getEstudiante().getApellido());
		
		System.out.println(personaEncontrada.get(0).getHorario().getDia());
		System.out.println(personaEncontrada.get(0).getHorario().getHoraDeInicio());
		System.out.println(personaEncontrada.get(0).getHorario().getHoraDeFin());

	}
}
