package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionPage extends HttpServlet{

	public void init() {
		
		System.out.println("servlet initilize !");
		
	}
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int no1 = Integer.parseInt(req.getParameter("no1"));
		int no2 = Integer.parseInt(req.getParameter("no2"));
		
		int add = no1 + no2;
		
		PrintWriter out = res.getWriter();
		
		req.setAttribute("k", add);
		
		RequestDispatcher rd = req.getRequestDispatcher("result");
		rd.forward(req, res);
		
	}
	
	
	public void destroy() {
		
		System.out.println("servlet destroy !");
		
	}
}
