package com.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.entidad.Docente;
import com.modelo.entidad.DocenteHorario;
import com.modelo.jpa.JPAHorarioDAO;

@WebServlet("/EliminarHorarioControlador")
public class EliminarHorarioControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EliminarHorarioControlador() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Docente docente = (Docente) request.getSession().getAttribute("usuarioLogueado");
		Integer idhorario = Integer.parseInt(request.getParameter("idhorario"));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyect1.0");
		EntityManager em = emf.createEntityManager();

		String sentenciaJPQL = "SELECT dh FROM DocenteHorario dh WHERE dh.docente.id= :docente AND dh.horario.idHorario= :horario";
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("docente", docente.getId());
		query.setParameter("horario", idhorario);

		DocenteHorario docenteHorario = (DocenteHorario) query.getSingleResult();
		
		DAOFactory.getFactory().getDocenteHorarioDAO().eliminar(docenteHorario.getIdDocenteHorario());

		/*em.getTransaction().begin();
		em.remove(docenteHorario);
		em.getTransaction().commit();*/

		String path = "/ListarHorarioControlador";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = "/ListarHorarioControlador";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
