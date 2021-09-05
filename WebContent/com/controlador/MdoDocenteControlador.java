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
@WebServlet("/MdoDocenteControlador")
public class MdoDocenteControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MdoDocenteControlador(){

	}


	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.sendRedirect("jsp/mdoDocente.jsp");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doGet(request, response);
	}
}//end MdoDocenteControlador