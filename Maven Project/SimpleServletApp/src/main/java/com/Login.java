package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw  = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		if(emailid.equals("raj@gmail.com") && password.equals("123")) {
			pw.println("successfully login with Get method");
		}else {
			pw.println("failure try once again with get method");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw  = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		if(emailid.equals("raj@gmail.com") && password.equals("123")) {
			pw.println("successfully login with post method");
		}else {
			pw.println("failure try once again with post method");
		}
	}

}
