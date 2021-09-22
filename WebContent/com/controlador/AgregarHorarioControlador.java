package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.DocenteDAO;
import com.modelo.dao.HorarioDAO;
import com.modelo.entidad.Docente;
import com.modelo.entidad.DocenteHorario;
import com.modelo.entidad.Horario;
import com.modelo.entidad.Persona;
import com.modelo.jpa.JPAHorarioDAO;

@WebServlet("/AgregarHorarioControlador")
public class AgregarHorarioControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AgregarHorarioControlador() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String dia1="";
	String horainicio="";
	String horafin="";
	String dia=request.getParameter("txtDia");
	/*System.out.println(dia);
	if(dia.equals("1")) {
    dia1="Lunes";
    System.out.println(dia1);
	}
	else if(dia.equals("2")) {
	dia1="Martes";
	System.out.println(dia1);
	}
	else if(dia.equals("3")) {
	dia1="Miercoles";
	System.out.println(dia1);
	}
	else if(dia.equals("4")) {
	dia1="Jueves";
	System.out.println(dia1);
	}
	else if(dia.equals("5")) {
		dia1="Viernes";
		System.out.println(dia1);
		}*/
	
	String FranjaHoraria=request.getParameter("txtFranjaHoraria");
	/*if(FranjaHoraria.equals("1")) {
		horainicio="11:00";
		horafin="11:15";
		}
	else if(FranjaHoraria.equals("2")) {
		horainicio="12:00";
		horafin="12:15";
		}
	else if(FranjaHoraria.equals("3")) {
		horainicio="13:00";
		horafin="13:15";
		}*/
	
	DocenteHorario docenteHorario = new DocenteHorario();
	
	JPAHorarioDAO horariodao = (JPAHorarioDAO) DAOFactory.getFactory().getHorarioDAO();
	Horario horario = 	horariodao.getHorarioByDiaHora(dia, FranjaHoraria);;
	
	System.out.println(horario.toString());
	
	Docente d = (Docente) request.getSession().getAttribute("usuarioLogueado");
	docenteHorario.setDocente(d);
	
	//horariodao.crear(horario);
	docenteHorario.setHorario(horario);
	
	DAOFactory.getFactory().getDocenteHorarioDAO().crear(docenteHorario);
	
	String path = "/ListarHorarioControlador";
	getServletContext().getRequestDispatcher(path).forward(request, response);
	
	}

}
