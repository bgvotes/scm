package com.bg.servlets;

import java.io.IOException;  
import java.io.PrintWriter;  
  

import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
import javax.servlet.http.HttpServlet;

import com.bg.dao.LoginDao;

public class LogoutServlet extends HttpServlet{
	
	  public void doGet(HttpServletRequest request,
              HttpServletResponse response)
      throws ServletException, IOException
      {
		  // Set response content type
		  response.setContentType("text/html");
	      HttpSession session = request.getSession(false);  	           
	      if(session!=null)  {
	    	  session.setAttribute("name", null);
	      }		  
		  // Actual logic goes here.
		  PrintWriter out = response.getWriter();
		  out.println("<h1>" + "Logout Succesfull"  + "</h1>");
      }

}
