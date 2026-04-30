package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionPage extends HttpServlet{

	public void init() {
		
		System.out.println("servlet initilize !");
		
	}
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int no1 = Integer.parseInt(req.getParameter("no1"));
		int no2 = Integer.parseInt(req.getParameter("no2"));
		
		int add = no1 + no2;
		
		PrintWriter out = res.getWriter();
		
		out.print("<h1>Addition Page!</h1><br>");
		out.print("<h3> Addition of "+no1+" + "+no2+" = "+add+" </h3>");
		
	}
	
	
	public void destroy() {
		
		System.out.println("servlet destroy !");
		
	}
}
