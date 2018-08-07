package lti.hola.service;

import java.util.Base64;
import java.util.Base64.Encoder;

import lti.hola.bean.ForgetBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
import lti.hola.repo.UserRepository;
import lti.hola.repo.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	private UserRepository repo;
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
		repo =new UserRepositoryImpl();
	}

	@Override
	public RegisterBean authenticate(LoginBean login) {
		//password encoding
		
		Encoder encoder=Base64.getEncoder();
		String encoded=encoder.encodeToString(login.getPass().getBytes());
		login.setPass(encoded);
		return repo.authenticate(login);
	}

	@Override
	public boolean validate(ForgetBean forget) {
		Encoder encoder=Base64.getEncoder();
		forget.setQn(encoder.encodeToString(forget.getQn().getBytes()));
		//String encoded=encoder.encodeToString(forget.getQn().getBytes());
		return repo.validate(forget);
	}

	@Override
	public boolean persist(RegisterBean register) {
		Encoder encoder=Base64.getEncoder();
		register.setPass(encoder.encodeToString(register.getPass().getBytes()));
//		Encoder encoder=Base64.getEncoder();
		register.setQn(encoder.encodeToString(register.getQn().getBytes()));
		return repo.persist(register);  
	}

	@Override
	public boolean changePassword(LoginBean login) {
		Encoder encoder=Base64.getEncoder();
		login.setPass(encoder.encodeToString(login.getPass().getBytes()));
		// TODO Auto-generated method stub
		return repo.changePassword(login);
	}

}
