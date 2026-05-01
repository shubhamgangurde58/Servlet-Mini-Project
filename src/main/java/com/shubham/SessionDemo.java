package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionDemo extends HttpServlet {
	

	public void init() {
		System.out.println("servlet initilize ");
	}
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int num1 =Integer.parseInt(req.getParameter("num1"));
		
		HttpSession session = req.getSession();
		session.setAttribute("k",num1);
		
		res.sendRedirect("result");
		
	}
	
	public void destroy() {
		
		System.out.println("servlet destroy ");
	}


}
