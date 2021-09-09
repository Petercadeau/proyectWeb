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
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 12:59:49
 */
@WebServlet("/CrearUsuarioControlador")
public class CrearUsuarioControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CrearUsuarioControlador(){

	}


	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String path = "/jsp/crearUsuario.jsp";
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
		String cedula = request.getParameter("txtCedula");
		String nombre = request.getParameter("txtNombre");
		String apellido = request.getParameter("txtApellido");
		String tipoDeUsuario = request.getParameter("txtTipoUsuario");
		
		Persona usuario=null;
		switch (tipoDeUsuario) {
		case "administrador":
			usuario=new Administrador(cedula,nombre,apellido,nombre+"2021");
			break;
		case "docente":
			usuario=new Docente(cedula,nombre,apellido,nombre+"2021");
			break;
		case "estudiantes":
			usuario=new Estudiante(cedula,nombre,apellido,nombre+"2021");
			break;
		default:
			break;
		}
		PersonaDAO personaDao = DAOFactory.getFactory().getPersonaDAO();
		personaDao.crear(usuario);
		String path = "/jsp/listarUsuarios.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}
}//end CrearUsuarioControlador