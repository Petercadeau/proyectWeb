package com.controlador;

import java.io.IOException;
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
		List<Horario> horarios = (List<Horario>)request.getAttribute("listaHorario");
		/*HorarioDAO horarioDAO = DAOFactory.getFactory().getHorarioDAO();
		List<Horario> horarios = horarioDAO.obtenerPorId(id);*/
		request.setAttribute("horarios", horarios);
		String path = "/jsp/seleccionarHorario.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
