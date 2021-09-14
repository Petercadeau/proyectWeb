package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.entidad.Docente;
import com.modelo.jpa.JPAHorarioDAO;

@WebServlet("/EliminarHorarioControlador")
public class EliminarHorarioControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EliminarHorarioControlador() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Docente docente = (Docente) request.getSession().getAttribute("usuarioLogueado");
		Integer idhorario = Integer.parseInt(request.getParameter("idhorario"));
		docente.getHorario().remove(idhorario);
		DAOFactory.getFactory().getDocenteDAO().actualizar(docente);

		/*
		 * System.out.println("entro por get");
		 * 
		 * JPAHorarioDAO jpahorariodao=new JPAHorarioDAO();
		 * jpahorariodao.eliminar(idhorario);
		 */

		String path = "/ListarHorarioControlador";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = "/ListarHorarioControlador";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
