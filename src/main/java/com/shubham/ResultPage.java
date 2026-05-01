package com.shubham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultPage extends HttpServlet{
	
	public void init() {
		
	}
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		
		PrintWriter out = res.getWriter();
		
//		int add = (int)req.getAttribute("k");
//		
//		out.print("<h1>Result Page!</h1><br>");
//		out.print("<h3> Addition of "+ add + " </h3>");
		
		out.print("<h1>Hello result Servlet</h1>");
		
		//int num = Integer.parseInt(req.getParameter("k"));
		
		HttpSession session = req.getSession();
		int num = (int)session.getAttribute("k");
		
		int sq = num * num;
		
		out.print("Square : "+sq);
		
		
	}
	
	public void destroy() {
		
		
	}

}
