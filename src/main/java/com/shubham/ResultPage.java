package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResultPage extends HttpServlet{
	
	public void init() {
		
	}
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		
		PrintWriter out = res.getWriter();
		
//		int add = (int)req.getAttribute("k");
//		
//		out.print("<h1>Result Page!</h1><br>");
//		out.print("<h3> Addition of "+ add + " </h3>");
		
		out.print("<h1>Hello Add Servlet</h1>");
		
		int num = Integer.parseInt(req.getParameter("k"));
		
		int sq = num * num;
		
		out.print("Square : "+sq);
		
		
	}
	
	public void destroy() {
		
		
	}

}
