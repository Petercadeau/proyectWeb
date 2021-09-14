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

@WebServlet("/ActualizarInformacionDocenteControlador")
public class ActualizarInformacionDocenteControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ActualizarInformacionDocenteControlador(){

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		System.out.println("He llegado al INICIO del GET docenteActualizar");
		Persona personaAutorizada = (Persona) request.getSession().getAttribute("usuarioLogueado");
		Integer id = personaAutorizada.getId(); 
		Persona persona = DAOFactory.getFactory().getPersonaDAO().obtenerPorId(id);
		List<Departamento> departamentos = DAOFactory.getFactory().getDepartamentoDAO().obtener();
		request.setAttribute("persona", persona);
		request.setAttribute("departamentos", departamentos);
		String path = "/jsp/actualizarInformacionDocente.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
		
		System.out.println("He llegado al FINAL del GET docenteActualizar");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("He llegado al INICIO del POST docenteActualizar");
		
		Integer id = Integer.parseInt(request.getParameter("txtIdDocente"));
		Docente docente = DAOFactory.getFactory().getDocenteDAO().obtenerPorId(id);
	
		docente.setNombre(request.getParameter("txtNombre"));
		docente.setApellido(request.getParameter("txtApellido"));
		Departamento d = DAOFactory.getFactory().getDepartamentoDAO().obtenerPorId(Integer.parseInt(request.getParameter("txtDepartamento")));
		
		docente.setDepartamento(d);


		DAOFactory.getFactory().getDocenteDAO().actualizar(docente);

		String path = "/jsp/mdoDocente.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
		
		System.out.println("He llegado al final del POST docenteActualizar");
	}
}//end ActualizarInformacionDocenteControlador