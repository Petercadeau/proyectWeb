package com.controlador;

import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.HorarioDAO;
import com.modelo.dao.TutoriaDAO;
import com.modelo.entidad.Horario;
import com.modelo.entidad.Persona;
import com.modelo.entidad.Tutoria;
import com.modelo.jpa.JPATutoriaDAO;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 12:59:49
 */
@WebServlet("/ListarTutoriaControlador")
public class ListarTutoriaControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ListarTutoriaControlador() {

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Get en LisTutos");
		TutoriaDAO tutoriaDAO = DAOFactory.getFactory().getTutoriaDAO();
		Persona d = (Persona) request.getSession().getAttribute("usuarioLogueado");
		List<Tutoria> horarios = tutoriaDAO.obtenerPorId(d.getId());
		request.setAttribute("horarios", horarios);
		String path = "/jsp/listarTutorias.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
