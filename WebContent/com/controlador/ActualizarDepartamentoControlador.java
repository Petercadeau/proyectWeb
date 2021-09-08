package com.controlador;

import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
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
@WebServlet("/ActualizarDepartamentoControlador")
public class ActualizarDepartamentoControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ActualizarDepartamentoControlador() {

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer id = Integer.parseInt(request.getParameter("txtId"));
		Departamento departamento = DAOFactory.getFactory().getDepartamentoDAO().obtenerPorId(id).get(0);
		request.setAttribute("departamento", departamento);
		response.sendRedirect("jsp/actualizarDepartamento.jsp");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String edificio = request.getParameter("txtEdificio");
		String nombre = request.getParameter("txtNombre");
		
		Departamento departamento = new Departamento(nombre, edificio);
		
		DepartamentoDAO departamentoDAO = DAOFactory.getFactory().getDepartamentoDAO();
		departamentoDAO.actualizar(departamento);
		String path = "/jsp/listarDepartamento.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}
}// end ActualizarDepartamentoControlador