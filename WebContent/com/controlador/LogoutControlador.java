package com.controlador;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;

/**
 * @author Peterca
 * @version 1.0
 * @created 01-sep.-2021 18:02:25
 */
@WebServlet("/LogoutControlador")
public class LogoutControlador extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LogoutControlador(){
		super();
	}


	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getSession().invalidate();
		Cookie ck[]=request.getCookies();  
		for(int i=0;i<ck.length;i++){  
		 System.out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
		}  
		request.getRequestDispatcher("/LoginControlador").forward(request, response);
	}

	/**
	 * 
	 * @param request
	 * @param response
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response){

	}
}//end LogoutControlador