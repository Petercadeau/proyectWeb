package com.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DocenteDAO;
import com.modelo.dao.PersonaDAO;
import com.modelo.entidad.Docente;
import com.modelo.entidad.Persona;

/**
 * Servlet implementation class ListarDocenteControlador
 */
@WebServlet("/ListarDocenteControlador")
public class ListarDocenteControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarDocenteControlador() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fecha = request.getParameter("txtFechaDia");
		System.out.println("Get en ListDocente");
		DocenteDAO docenteDAO = DAOFactory.getFactory().getDocenteDAO();
		List<Docente> docentes = docenteDAO.obtenerPorFecha(fecha);
		request.setAttribute("docentes", docentes);
		String path = "/jsp/listarDocentes.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
