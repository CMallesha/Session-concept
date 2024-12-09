package com.session.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//collecting data from user
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		
		//Session object cretion
		HttpSession s=req.getSession();//it none has argument and also boolean
		s.setAttribute("sid", id);
		s.setAttribute("pass", password);
		
		PrintWriter out=resp.getWriter();
		out.println("<a href=\"secondservlet\">View</a>");
	}

}
