package com.controlador;

import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;

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

@WebServlet("/EliminarUsuarioControlador")
public class EliminarUsuarioControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EliminarUsuarioControlador(){

	}


	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = Integer.parseInt(request.getParameter("txtId"));
		String tipoUsuario = request.getParameter("txtTipoUsuario");
		switch(tipoUsuario) {
			case "Administrador":
				DAOFactory.getFactory().getAdministradorDAO().eliminar(id);
				break;
			case "Estudiante":
				DAOFactory.getFactory().getEstudianteDAO().eliminar(id);
				break;
			case "Docente":
				DAOFactory.getFactory().getDocenteDAO().eliminar(id);
				break;
		}
		String path = "/ListarUsuarioControlador";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}
}//end EliminarUsuarioControlador