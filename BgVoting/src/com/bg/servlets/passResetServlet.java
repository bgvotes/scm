package com.bg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bg.dao.LoginDao;

public class passResetServlet extends HttpServlet{ 

    public void doPost(HttpServletRequest request, HttpServletResponse response)    
            throws ServletException, IOException {    
  
        response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String n=request.getParameter("username");    
        String p=request.getParameter("oldPass");   
        String newPass=request.getParameter("newPass");
        
        HttpSession session = request.getSession(false);  
        if(session!=null)  
        session.setAttribute("name", n);  
  
        RequestDispatcher rd = null;
        
        if(LoginDao.validate(n, p)){    
        	if(LoginDao.updatePassword(n, newPass)){
        		rd=request.getRequestDispatcher("PasswordReset.jsp");
        	}else
        	{
        		rd=request.getRequestDispatcher("welcome.jsp");    
        	}
            rd.forward(request,response);    
        }    
        else{
        	session.setAttribute("name", "UserName Password are not matching");
            out.print("<p style=\"color:red\">Sorry password reset failed</p>");    
            rd=request.getRequestDispatcher("index.jsp");    
            rd.include(request,response);    
        }    
  
        out.close();    
    }    
}
