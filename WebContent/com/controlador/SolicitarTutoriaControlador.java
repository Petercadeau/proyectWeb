package com.controlador;

import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.entidad.Tutoria;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 12:59:49
 */
@WebServlet("/SolicitarTutoriaControlador")
public class SolicitarTutoriaControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SolicitarTutoriaControlador() {

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String path = "/jsp/solicitarTutoria.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	/**
	 * 
	 * @param request
	 * @param response
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		Tutoria t = new Tutoria();
		t.setDocente(DAOFactory.getFactory().getDocenteDAO().obtenerPorId((Integer)request.getAttribute("idDocente")));
		t.setEstudiante(DAOFactory.getFactory().getEstudianteDAO().obtenerPorId((Integer)request.getAttribute("idEstudiante")));
		t.setHorario(DAOFactory.getFactory().getHorarioDAO().obtenerPorId((Integer)request.getAttribute("idHorario")));
		DAOFactory.getFactory().getTutoriaDAO().crear(t);
	}
}
