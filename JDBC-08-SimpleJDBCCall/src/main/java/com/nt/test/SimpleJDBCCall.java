package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IAuthenticationMangService;

public class SimpleJDBCCall {

	public static void main(String[] args) {
		//create IOC Conatiner
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

IAuthenticationMangService service= ctx.getBean("authService", IAuthenticationMangService.class);		
System.out.println(service.login("raja", "rani"));
	
	((AbstractApplicationContext) ctx).close();
	}

}
