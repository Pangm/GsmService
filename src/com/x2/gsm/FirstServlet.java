package com.x2.gsm;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(name="/firstServlet", urlPatterns={"/info"})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charSet=UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String[] color = request.getParameterValues("color");
		
		String national = request.getParameter("country");
		
		PrintStream out = new PrintStream(response.getOutputStream());
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("your name: " + name + "<hr/>");
		out.println("your gender: " + gender + "<hr/>");
		out.println("the color you like: ");
		for (String c : color) {
			out.println(c + " ");
		}
		out.println("<hr/>");
		out.println("You are from " + national + "<hr/>");
		out.println("</body>");
		out.println("</html>");

		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
