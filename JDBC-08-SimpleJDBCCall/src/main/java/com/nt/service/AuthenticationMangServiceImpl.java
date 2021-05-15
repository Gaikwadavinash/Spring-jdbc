package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.AuthenticationDAOImpl;
import com.nt.dao.IAuthenticationDAO;

@Service("authService")
public class AuthenticationMangServiceImpl implements IAuthenticationMangService {

	@Autowired
	private IAuthenticationDAO dao;
	
	public AuthenticationMangServiceImpl() {
	dao= new AuthenticationDAOImpl();
	}
	@Override
	public String login(String user, String pass) {
		String Result=dao.authenticateUserList(user, pass);
		return Result;
	}

}
