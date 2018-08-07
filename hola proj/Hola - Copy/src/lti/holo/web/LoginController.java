package lti.holo.web;

import javax.servlet.http.HttpServletRequest;

import lti.hola.bean.ForgetBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;
import lti.hola.service.UserServiceImpl;

public class LoginController {
	
	public static RegisterBean authenticate(HttpServletRequest request)
	{
		UserService service=new UserServiceImpl();
		
		LoginBean login=new LoginBean();
		login.setEmail(request.getParameter("email"));
		login.setPass(request.getParameter("pass"));
		//passing login bean object to service method
		RegisterBean user = service.authenticate(login);
		return user;
	}

	public static boolean forgetPassword(HttpServletRequest request) {
		UserService service=new UserServiceImpl();
		
		ForgetBean forget=new ForgetBean();
		forget.setEmail(request.getParameter("email"));
		forget.setQn(request.getParameter("qn"));
		
		return service.validate(forget);
	}

	public static boolean changePassword(HttpServletRequest request) {
		UserService service=new UserServiceImpl();
		
		LoginBean change=new LoginBean();
		change.setEmail(request.getParameter("email"));
		change.setPass(request.getParameter("pass"));
		
		return service.changePassword(change);
	}

}
