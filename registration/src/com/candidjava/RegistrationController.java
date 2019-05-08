package com.candidjava;

import java.io.IOException;
import com.google.gson.Gson;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDataServlet
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 
	 protected void doGet(HttpServletRequest request,   HttpServletResponse response) throws ServletException, IOException {
	   
	   String country=request.getParameter("countryname");
	   Map<String, String> ind = new LinkedHashMap<String, String>();
	      ind.put("1", "New delhi");
	      ind.put("2", "Tamil Nadu");
	      ind.put("3", "Kerala");
	      ind.put("4", "Andhra Pradesh");
	       
	      Map<String, String> us = new LinkedHashMap<String, String>();
	      us.put("1", "Washington");
	      us.put("2", "California");
	      us.put("3", "Florida");
	      us.put("4", "New York");
	      String json = null ;
	      if(country.equals("India")){
	       json= new Gson().toJson(ind);   
	      }
	      else if(country.equals("US")){
	       json=new Gson().toJson(us);  
	      }
	      response.setContentType("application/json");
	      response.setCharacterEncoding("UTF-8");
	      response.getWriter().write(json);       
	  }
	  
	 
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("fullname");
		String Addr = request.getParameter("address");
		String age = request.getParameter("age");
		String Qual = request.getParameter("qual");
		String Persent = request.getParameter("percent");
		String Year = request.getParameter("yop");
		if(name.isEmpty()||Addr.isEmpty()||age.isEmpty()||Qual.isEmpty()||Persent.isEmpty()||Year.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
	}

}
