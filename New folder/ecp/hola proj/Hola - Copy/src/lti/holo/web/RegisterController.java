package lti.holo.web;

import javax.servlet.http.HttpServletRequest;

import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;
import lti.hola.service.UserServiceImpl;

public class RegisterController {
	public static boolean registration(HttpServletRequest request)
	{
		UserService service=new UserServiceImpl();
		RegisterBean register=new RegisterBean();
		register.setName(request.getParameter("name"));
		register.setEmail(request.getParameter("email"));
		register.setPass(request.getParameter("pass"));
		register.setAge(Integer.parseInt(request.getParameter("age")));
		register.setGender(request.getParameter("gender"));
		register.setCity(request.getParameter("city"));
		register.setQn(request.getParameter("qn"));
		register.setPhoto(request.getParameter("photo"));
		return service.persist(register);
		
	}

}
