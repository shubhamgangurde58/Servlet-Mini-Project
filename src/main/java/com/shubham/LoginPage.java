package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginPage extends HttpServlet{

	public void init() {
			System.out.println("Servlet Initilize ! ");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			PrintWriter out = res.getWriter();
			
			if(username.equals("Admin") && password.equals("123")) {
				
				System.out.println("Welcom Admin ! ");
				out.print("<h1>Welcome Admin !</h1>");
			}
			else {
				
				System.out.println("Invalid Username and Password ! ");
				out.print("<h1>Invalid Username & Password !</h1>");
			}
	}
	
	public void destroy() {
		
			System.out.println("Servlet destroy ! ");
		
	}
	
}
