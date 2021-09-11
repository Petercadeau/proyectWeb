package com.controlador;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modelo.dao.AdministradorDAO;
import com.modelo.dao.DAOFactory;
import com.modelo.dao.PersonaDAO;
import com.modelo.entidad.Administrador;
import com.modelo.entidad.Docente;
import com.modelo.entidad.Estudiante;
import com.modelo.entidad.Persona;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
	 * @throws ServletException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Get en Login");
		String path = "/jsp/login.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
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
		System.out.println("Post en Login");
		String cedula = request.getParameter("txtCedula");
		String password = request.getParameter("txtPassword");
		boolean recordarme = "true".equals(request.getParameter("remember"));

		PersonaDAO<Persona> personaModelo = DAOFactory.getFactory().getPersonaDAO();

		HttpSession sesion = request.getSession();
		Persona personaAutorizada = personaModelo.autorizar(cedula, password);
		if(personaAutorizada==null) {
			System.out.println("No existe el usuario");
			doGet(request, response);
		}else {
			if (recordarme) {
				System.out.println("COOKIE IF 1:"+recordarme);
				Cookie cookieCedula = new Cookie("cedula", cedula);
				cookieCedula.setMaxAge(604800);
				 
				Cookie cookiePass = new Cookie("password", password);
				cookiePass.setMaxAge(604800);
				
				Cookie cookieRecordarme = new Cookie("recordarme", "checked");
				cookiePass.setMaxAge(604800);
				 
				response.addCookie(cookieCedula);
				response.addCookie(cookiePass);
				response.addCookie(cookieRecordarme);
	        }
			else {
				System.out.println("COOKIE ELSE:"+recordarme);
				Cookie cookieCedula = new Cookie("cedula", "");
				cookieCedula.setMaxAge(0);
				 
				Cookie cookiePass = new Cookie("password", "");
				cookiePass.setMaxAge(0);
				
				Cookie cookieRecordarme = new Cookie("recordarme", "");
				cookieRecordarme.setMaxAge(0);
				 
				response.addCookie(cookieCedula);
				response.addCookie(cookiePass);		
				response.addCookie(cookieRecordarme);	
			}
				
			switch (personaAutorizada.getTipoDeUsuario()) {
				case "Administrador": {
					System.out.println("Soy el admin brah");
		
					Administrador admin = (Administrador) personaAutorizada;
					sesion.setAttribute("usuarioLogueado", admin);
					request.getRequestDispatcher("/MdoAdministradorControlador").forward(request, response);
					break;
				}
				case "Docente": {
					System.out.println("Soy el docent brah");
		
					Docente docente = (Docente) personaAutorizada;
					sesion.setAttribute("usuarioLogueado", docente);
					request.getRequestDispatcher("/MdoDocenteControlador").forward(request, response);
					break;
				}
				case "Estudiante": {
					System.out.println("Soy el estudiante brah");
		
					Estudiante estudiante = (Estudiante) personaAutorizada;
					sesion.setAttribute("usuarioLogueado", estudiante);
					request.getRequestDispatcher("/MdoEstudianteControlador").forward(request, response);
					break;
				}
				default:
					doGet(request, response);
					break;
			}
		}
	}
}// end LoginControlador