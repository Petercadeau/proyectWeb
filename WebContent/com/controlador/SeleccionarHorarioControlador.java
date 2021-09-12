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
import com.modelo.entidad.Tutoria;

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
		List<Horario> horarios = horariodDao.obtenerListaPorId(txtId);
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
		
		Tutoria t = new Tutoria();
		Integer id = Integer.parseInt((String) request.getAttribute("idDocente"));
		//System.out.println("LLEgó: "+idDocente);
		//t.setDocente(DAOFactory.getFactory().getDocenteDAO().getById(Integer.parseInt(idDocente)) );
		System.out.println("Hola como estás, aquí está la webada que necesitas:  "+t.getDocente().getNombre());
		//t.setEstudiante(DAOFactory.getFactory().getEstudianteDAO().obtenerPorId((Integer)request.getAttribute("idEstudiante")));
		//t.setHorario(DAOFactory.getFactory().getHorarioDAO().obtenerPorId((Integer)request.getAttribute("idHorario")));
		//DAOFactory.getFactory().getTutoriaDAO().crear(t);
	}

}
