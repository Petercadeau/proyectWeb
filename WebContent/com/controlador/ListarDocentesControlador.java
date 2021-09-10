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
 * Servlet implementation class ListarDocentesControlador
 */
@WebServlet("/ListarDocentesControlador")
public class ListarDocentesControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarDocentesControlador() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fecha = request.getParameter("txtDiaFecha");
		System.out.println("Get en ListDocente "+fecha);
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
