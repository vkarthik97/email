package lti.holo.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;
import lti.hola.service.UserServiceImpl;

/**
 * Servlet implementation class UserController
 */
// @WebServlet(name="User", urlPatterns= {"/User.hola"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService service;

	// @Override
	// public void init() throws ServletException {
	// // TODO Auto-generated method stub
	// service = new UserServiceImpl();
	// }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String referer = request.getHeader("referer");
		//getting session from request if session id exist in request header 
		// uid session obj returned otherwise fresh session created
		HttpSession session=request.getSession();
		if (referer.contains("home.jsp")) {
			// request coming from home for login authentication
			RegisterBean user = LoginController.authenticate(request);
			if (user != null) {
				// LOGIN SUCCESSFULL keeping logged in user's details in session
                session.setAttribute("User", user);
				response.sendRedirect("profile.jsp");
			} else {
				// login failed
				response.sendRedirect("home.jsp?invalid=yes");
			}
		} else if (referer.contains("register.jsp")) {
			// request coming for user registeration
			if(RegisterController.registration(request))
				response.sendRedirect("home.jsp");
			else
				response.sendRedirect("register.jsp");
		} 
		else if (referer.contains("forget.jsp")) {
			// request coming for validating user for password change
			if(LoginController.forgetPassword(request))
				response.sendRedirect("change.jsp");
			else
				response.sendRedirect("forget.jsp?invalid=yes");
		} 
		else if (referer.contains("change.jsp"))
		{
			if(LoginController.changePassword(request))
			{
				response.sendRedirect("home.jsp");
				
			}
			else
				response.sendRedirect("change.jsp");
			// request coming for updating record
		}
		else
		{
			//request coming from logout - destroying session
			session.invalidate();
			response.sendRedirect("home.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Delegating call to doget method to perform common logic
		doGet(request, response);
	}

}
