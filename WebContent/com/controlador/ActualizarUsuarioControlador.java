package com.controlador;

import javax.servlet.http.HttpServletResponse;

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
import javax.servlet.http.HttpServlet;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 12:59:49
 */

@WebServlet("/ActualizarUsuarioControlador")
public class ActualizarUsuarioControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ActualizarUsuarioControlador() {

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Integer id = Integer.parseInt(request.getParameter("txtId"));
		Persona persona = DAOFactory.getFactory().getPersonaDAO().obtenerPorId(id);
		request.setAttribute("persona", persona);
		String path = "/jsp/actualizarUsuario.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
		String cedula = request.getParameter("txtCedula");
		String nombre = request.getParameter("txtNombre");
		String apellido = request.getParameter("txtApellido");
		String tipoDeUsuario = request.getParameter("txtTipoUsuario");
		String clave = request.getParameter("txtClave");
		int id=Integer.parseInt(request.getParameter("id"));
		Persona usuario=DAOFactory.getFactory().getPersonaDAO().obtenerPorId(id);
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setCedula(cedula);
		usuario.setClave(clave);
		
		
		/*switch (tipoDeUsuario) {
		case "Administrador":
			usuario=DAOFactory.getFactory().getAdministradorDAO().obtenerPorId(request.getAttribute(clave));
			break;
		case "Docente":
			usuario=new Docente(cedula,nombre,apellido,clave);
			break;
		case "Estudiante":
			usuario=new Estudiante(cedula,nombre,apellido,clave);
			break;
		default:
			break;
		}*/
		PersonaDAO personaDao = DAOFactory.getFactory().getPersonaDAO();
		personaDao.actualizar(usuario);
		String path = "/jsp/listarUsuarios.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}
}// end ActualizarUsuarioControlador