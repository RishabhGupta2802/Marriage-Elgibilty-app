package com.rg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException ,IOException{
		//get PrintWriter obj
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read from data(reqest param from respone obj
		String name=req.getParameter("pname");
		String tage=req.getParameter("page");
		String gender=req.getParameter("pgender");
		int age=Integer.parseInt(tage);
		//write b.logic
		if(gender.equals("male")) {
			if(age>=21)
				pw.println("<h1 style:'color:green;text-align:center'>Mr. "+ name +" you are eligibile for marriage</h1>");
			else
				pw.println("<h1 style:'color:red;text-align:center'>Mr. "+ name +" you are not eligible for marriage</h1>");
		}
		if(gender.equals("female")) {
			if(age>=18)
				pw.println("<h1 style:'color:green;text-align:center'>Mrs. "+ name +" you are eligible for marriage</h1>");
			else
				pw.println("<h1 style:'color:red;text-align:center'>Mrs. "+ name +" you are not eligible for marriage</h1>");
				
		}
		pw.println("<a href='http://localhost:2525/MarriageEligibiltyApp/details_form.html'>Home</a>");
		
		//close obj
		pw.close();
	}

}
