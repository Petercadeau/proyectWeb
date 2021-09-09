package test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.modelo.dao.AdministradorDAO;
import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.dao.DocenteDAO;
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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect1.0");
		EntityManager em = emf.createEntityManager();


		
		Horario horario = new Horario("Martes","7:00","7:15");
		/*HorarioDAO horariodao = DAOFactory.getFactory().getHorarioDAO();
		horariodao.crear(horario);*/
		
		Administrador d = new Administrador("1717171717","J","P","123");
		
		ArrayList<Horario> t=new ArrayList<Horario>();
		t.add(horario);
		/*
		d.setHorario(t);
		d.setDepartamento(new Departamento("ccss", "101"));
		*/
		AdministradorDAO dc = DAOFactory.getFactory().getAdministradorDAO();
		dc.crear(d);
		
	}
}
