package com.controlador;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modelo.dao.AdministradorDAO;
import com.modelo.dao.DAOFactory;
import com.modelo.dao.UsuarioDAO;
import com.modelo.entidad.Administrador;
import com.modelo.entidad.Docente;
import com.modelo.entidad.Estudiante;
import com.modelo.entidad.Usuario;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:20
 */
@WebServlet("/LoginControlador")
public class LoginControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginControlador() {
		super();
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("jsp/login.jsp");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cedula = request.getParameter("cedula");
		String password = request.getParameter("password");

		UsuarioDAO<Usuario> personaModelo = DAOFactory.getFactory().getUsuarioDAO();
		Usuario personaAutorizada = personaModelo.autorizar(new Usuario(cedula, password));
		System.out.println(personaAutorizada.getTipoUsuario());
		HttpSession sesion = request.getSession();
		// sesion.setAttribute("usuarioLogueado", personaAutorizada);
		switch (personaAutorizada.getTipoUsuario()) {
		case "admin": {
			System.out.println("Soy el jefe1");
			Administrador admin = (Administrador) personaAutorizada.getPersona();
			sesion.setAttribute("usuarioLogueado", admin);
			request.getRequestDispatcher("/MdoAdministradorControlador").forward(request, response);
			break;
		}
		case "docente": {
			Docente docente = (Docente) personaAutorizada.getPersona();
			sesion.setAttribute("usuarioLogueado", docente);
			request.getRequestDispatcher("/MdoDocenteControlador").forward(request, response);
			break;
		}
		case "estudiante": {
			Estudiante estudiante = (Estudiante) personaAutorizada.getPersona();
			sesion.setAttribute("usuarioLogueado", estudiante);
			request.getRequestDispatcher("/MdoEstudianteControlador").forward(request, response);
			break;
		}
		default:
			doGet(request, response);
			break;
		}
	}
}// end LoginControlador