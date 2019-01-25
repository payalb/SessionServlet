package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/validateDetails")
public class ValidateController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password= req.getParameter("password");
		//lesson 4, 5
		HttpSession session=req.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		PrintWriter out=resp.getWriter();
		out.println("<form action='./ViewDetails.jsp' method='post'>");
		
		out.println("Welcome "+ username );
		out.println("<input type='submit'/>");
		out.println("</form>");
	}
}

// login.jsp -> username | password submit (request: /validateDetails)-> |
//submit /viewDetails
//Http is a stateless protocol: session