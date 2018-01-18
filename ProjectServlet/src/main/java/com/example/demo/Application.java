package com.example.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Application")
public class Application extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1342683088272167610L;

	public void init() throws ServletException {
		super.init();

	}

	public void destroy() {
		super.destroy();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String testHeaderID = "test GET";
		testHeaderID = request.getHeader(testHeaderID);
		String responseText = "GET is used to read information information.";
		response.getWriter().append(responseText);
		response.setStatus(HttpServletResponse.SC_OK);
		System.out.println("GET was called.");
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String testHeaderID = "test PUT";
		testHeaderID = request.getHeader(testHeaderID);
		String responseText = "Use this (PUT) to update information.";
		response.getWriter().append(responseText);
		response.setStatus(HttpServletResponse.SC_OK);
		System.out.println("PUT was called.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String testHeaderID = "test POST";
		testHeaderID = request.getHeader(testHeaderID);
		String responseText = ("Data can be created using this method (POST).");
		response.getWriter().append(responseText);
		response.setStatus(HttpServletResponse.SC_OK);
		System.out.println("POST was called.");
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String testHeaderID = "test DELETE";
		testHeaderID = request.getHeader(testHeaderID);
		String responseText = "Only use DELETE to remove the specified target.";
		response.getWriter().append(responseText);
		response.setStatus(HttpServletResponse.SC_OK);
		response.sendError(HttpServletResponse.SC_NOT_FOUND, "Not found");
		System.out.println("DELETE was called.");
	}
}
