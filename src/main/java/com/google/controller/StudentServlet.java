package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet{
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		
		String Name = request.getParameter("SName");
		String Gender = request.getParameter("gender");
		String Hobby[] = request.getParameterValues("hobby");
		String City = request.getParameter("city");
		String Address = request.getParameter("address");
		
		System.out.println(Name);
		System.out.println(Gender);
		System.out.println(City);
		for (int i=0;i<Hobby.length;i++) {
			
			System.out.print(Hobby[i]);
			
		}
		System.out.println(Address);
		

		PrintWriter out = response.getWriter();
		
		out.println(Name);
		out.println(Gender);
		
		for (int i=0;i<Hobby.length;i++) {
			
			out.println(Hobby[i]);
			
		}
		out.println(City);
		out.println(Address);


		
	}

}
