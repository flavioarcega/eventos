package br.org.ftsl.docker;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 2006900719595921566L;
	
	private int conn = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			  throws ServletException, IOException {
		
		conn ++;
		
		response.getWriter().write("<html><body>Total de conexões:"+conn+"</body></html>");
	}
}