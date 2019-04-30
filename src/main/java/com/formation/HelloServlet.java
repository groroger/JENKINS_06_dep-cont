package com.formation;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException
	{
		PrintWriter writer = response.getWriter();
		writer.println("Hello from HelloServlet!");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException
	{
		doGet(request, response);
	}
	
	// comm pour commit
}
