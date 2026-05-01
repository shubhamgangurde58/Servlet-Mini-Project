package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo extends HttpServlet{
	
	
	public void init() {
		System.out.println("servlet initilize ");
	}
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		String n1 = req.getParameter("username");
		
		PrintWriter out = res.getWriter();
		
		out.print("UserName = "+n1);
		
		Cookie cookie = new Cookie("username","admin");
		res.addCookie(cookie);
		
		Cookie[] cookies =  req.getCookies();
		boolean userVisit = false;
		
		if(cookies != null) {
			
			for(int i = 0 ; i < cookies.length; i ++) {
				
				Cookie c = cookies[i];
				String name = c.getName();
				String val = c.getValue();
				
				if(name.equals("username") && val.equals("admin")) {
					out.print("Welcome Back "+n1);
					userVisit = true;
					break;
				}
				
			}
			
		}
		if(userVisit == false) {

			Cookie c = new Cookie("username","admin");
			res.addCookie(c);
			out.print("Welcome = "+n1);
		}
		
	}
	
	public void destroy() {
		
		System.out.println("servlet destroy ");
	}

}
