package com.session.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/secondservlet")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession s=req.getSession(false);
		
		String id=(String)s.getAttribute("sid");
		String password=(String)s.getAttribute("pass");
		String sessionId=req.getRequestedSessionId();
		
		
		PrintWriter out=resp.getWriter();
		out.println("<h1> ID:"+id+" Password:"+password+" SessionId:"+sessionId+"</h1>"
				+ "<a href=\"login.jsp\">Login</a>");
		
		s.invalidate();
	}
}
