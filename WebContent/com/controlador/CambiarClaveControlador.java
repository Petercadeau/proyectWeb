package com.controlador;

import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.dao.EstudianteDAO;
import com.modelo.dao.PersonaDAO;
import com.modelo.entidad.Administrador;
import com.modelo.entidad.Departamento;
import com.modelo.entidad.Docente;
import com.modelo.entidad.Estudiante;
import com.modelo.entidad.Persona;

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
@WebServlet("/CambiarClaveControlador")
public class CambiarClaveControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CambiarClaveControlador() {

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer id = Integer.parseInt(request.getParameter("txtId"));
		Persona persona = DAOFactory.getFactory().getPersonaDAO().obtenerPorId(id).get(0);
		request.setAttribute("persona", persona);
		response.sendRedirect("jsp/cambiarClave.jsp");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("txtId"));
		String claveNueva = request.getParameter("txtClaveNueva");

		PersonaDAO personaDao = DAOFactory.getFactory().getPersonaDAO();
		Estudiante estudiante = (Estudiante) personaDao.obtenerPorId(id).get(0);
		estudiante.setClave(claveNueva);
		
		personaDao.actualizar(estudiante);
		String path = "/jsp/mdoEstudiante.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);

	}
}// end CambiarClaveControlador