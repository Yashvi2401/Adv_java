package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NameServlet")

public class NameServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String firstName = request.getParameter("firstName");
		String caseOption = request.getParameter("case");
		
		
		if("upper".equals(caseOption)) {
            firstName = firstName.toUpperCase();
        }
        
        if("lower".equals(caseOption)) {
            firstName = firstName.toLowerCase();
        }
		
		
		PrintWriter out = response.getWriter();
		
		out.println(firstName);
		
	}
		

}
