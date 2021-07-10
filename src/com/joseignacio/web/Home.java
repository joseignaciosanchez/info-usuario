package com.joseignacio.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("name");
		String lastName = request.getParameter("last");
		String favLanguage = request.getParameter("language");
		String hometown = request.getParameter("city");
		String desconocido = "Unknown";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		if (request.getParameter("name") == null) {
			firstName = desconocido;
		}
		if (request.getParameter("last") == null) {
			lastName = desconocido;
		}
		if (request.getParameter("language") == null) {
			favLanguage = desconocido;
		}
		if (request.getParameter("city") == null) {
			hometown = desconocido;
		}
		
		out.write("<h1>Welcome, "+firstName+" "+lastName+"</h1>");
		out.write("<h3>Your favorite language is: "+favLanguage+"</h3>");
		out.write("<h3>Your hometown is: "+hometown+"</h3>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
