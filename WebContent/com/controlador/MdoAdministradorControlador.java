package com.controlador;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 12:59:49
 */

@WebServlet("/MdoAdministradorControlador")
public class MdoAdministradorControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MdoAdministradorControlador() {

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Soy el jefe get");
		response.sendRedirect("jsp/mdoAdministrador.jsp");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Soy el jefe post");
		doGet(request, response);
	}
}// end MdoAdministradorControlador