package com.x2.gsm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsyncServlet
 */
@WebServlet(urlPatterns="/async", asyncSupported=true)
public class AsyncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<title>Async call example.");
		out.println("the time stepping into servlet: "
				+ new Date() + ".<br/>");
		out.flush();
		AsyncContext actx = request.startAsync();
		actx.setTimeout(30 * 1000);
		actx.start(new Executor(actx));
		out.println("the time when the servlet ended: "
				+ new Date() + ".<br/>");
		out.flush();
		
	}

}
