package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")

public class RegistrationServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String checkSelected = request.getParameter("checkSelected");
		
		boolean isError = false;
		boolean isCheckSelected = false;
		
		if(firstName== null || firstName.trim().length()== 0)
		{
			isError=true;
			request.setAttribute("firstNameError","Please Enter First name");
		}
		else {
			request.setAttribute("firstNameValue",firstName);
		}
		
		if(gender== null)
		{
			isError=true;
			request.setAttribute("genderError","Please select gender");
		}
		else {
			request.setAttribute("genderValue", gender);
		}
		
		if(city.equals("-1"))
		{
			isError=true;
			request.setAttribute("cityError", "Please select City");
		}
		
		else {
			request.setAttribute("cityValue", city);
		}
		
		
		
		if(isError==true )
		{
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request, response);
		}
		
		
		
		else
		{
			
			if(checkSelected == null)
			{
				isCheckSelected=true;
				request.setAttribute("checkError","Plese select this box" );
				
				RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
				rd.forward(request, response);
				
			}
			
			else {
				
				RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
				rd.forward(request, response);
				
			}
			
			
		}

		
	}

}
