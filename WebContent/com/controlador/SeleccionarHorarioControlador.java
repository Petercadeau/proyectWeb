package com.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.HorarioDAO;
import com.modelo.entidad.Horario;
import com.modelo.entidad.Persona;

/**
 * Servlet implementation class SeleccionarHorarioControlador
 */
@WebServlet("/SeleccionarHorarioControlador")
public class SeleccionarHorarioControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SeleccionarHorarioControlador() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer txtId = Integer.parseInt(request.getParameter("txtId"));
		String txtDia = request.getParameter("txtDia");
		HorarioDAO horariodDao = DAOFactory.getFactory().getHorarioDAO();
		List<Horario> horarios = horariodDao.obtenerPorId(txtId);
		List<Horario> horarioFinal = new ArrayList<Horario>();
		for (Horario h : horarios) {
			if (h.getDia().equals(txtDia)) {
				horarioFinal.add(h);
			}
		}
		request.setAttribute("horarios", horarioFinal);
		request.setAttribute("idDocente", txtId);
		request.setAttribute("txtDia", txtDia);
		String path = "/jsp/seleccionarHorario.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
