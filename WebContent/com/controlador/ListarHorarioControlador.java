package com.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DepartamentoDAO;
import com.modelo.dao.HorarioDAO;
import com.modelo.entidad.Departamento;
import com.modelo.entidad.Horario;
import com.modelo.entidad.Persona;

@WebServlet("/ListarHorarioControlador")
public class ListarHorarioControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListarHorarioControlador() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Get en ListHorarios");
		HorarioDAO horarioDAO = DAOFactory.getFactory().getHorarioDAO();
		Persona d = (Persona) request.getSession().getAttribute("usuarioLogueado");
		List<Horario> horarios = horarioDAO.obtenerPorId(d.getId());
		request.setAttribute("departamentos", horarios);
		String path = "/jsp/configurarDisponibilidad.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
