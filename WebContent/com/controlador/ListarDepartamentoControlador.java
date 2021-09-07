package com.controlador;

import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.entidad.Departamento;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.List;

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
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		DepartamentoDAO departamentoDao = DAOFactory.getFactory().getDepartamentoDAO();
		List<Departamento> departamentos = departamentoDao.obtener();
		for(Departamento d: departamentos) {
			System.out.println(d.getNombre());
		}
		response.sendRedirect("jsp/listarDepartamento.jsp");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}
}// end ListarDepartamentoControlador