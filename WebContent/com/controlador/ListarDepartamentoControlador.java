package com.controlador;

import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.entidad.Departamento;

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
@WebServlet("/ListarDepartamentoControlador")
public class ListarDepartamentoControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ListarDepartamentoControlador() {

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Get en ListDepas");
		DepartamentoDAO departamentoDao = DAOFactory.getFactory().getDepartamentoDAO();
		List<Departamento> departamentos = departamentoDao.obtener();
		request.setAttribute("departamentos", departamentos);
		String path = "/jsp/listarDepartamento.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
		//response.sendRedirect("jsp/listarDepartamento.jsp");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doGet(request, response);
	}
}// end ListarDepartamentoControlador