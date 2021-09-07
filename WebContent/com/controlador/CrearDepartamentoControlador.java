package com.controlador;

import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.dao.PersonaDAO;
import com.modelo.entidad.Departamento;
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
@WebServlet("/CrearDepartamentoControlador")
public class CrearDepartamentoControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CrearDepartamentoControlador() {

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("jsp/crearDepartamento.jsp");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("txtNombre");
		String edificio = request.getParameter("txtEdificio");
		Departamento departamento = new Departamento(nombre, edificio);
		DepartamentoDAO departamentoDao = DAOFactory.getFactory().getDepartamentoDAO();
		departamentoDao.crear(departamento);
		String path = "/jsp/listarDepartamento.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}
}// end CrearDepartamentoControlador