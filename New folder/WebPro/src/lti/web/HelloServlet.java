package lti.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private int counter;
@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		counter=1000;
	}
	//	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//setting response MIME type
		response.setContentType("text/html");
		
		//getting response stream to write html output
		PrintWriter out=response.getWriter();
		
		//writing HTML as output on response stream
		out.println("<body bgcolor=wheat text=tomato>");
		out.println("<h1> hello world</h1><hr>");
		out.println("<h2>welcome to servlet<h2>");
		
		Date now=new Date();
		out.println("<h3> visit time: "+ now+"</h3>");
		out.println("<h3>Visitor no:"+(counter++  +"</h3>"));
		
		//getting servlet config object
		
		ServletConfig config=getServletConfig();
		String author=config.getInitParameter("Authur");
		out.println("<h3>Author:"+ author + "</h3>");
		out.println("<h3>Servlet Name:"+ config.getServletName() + "</h3>");
	}

}
