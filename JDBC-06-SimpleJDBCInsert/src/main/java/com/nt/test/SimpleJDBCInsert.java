package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.Actor;
import com.nt.service.ActorMangServiceImpl;

public class SimpleJDBCInsert {

	public static void main(String[] args) {
ApplicationContext ctx= new ClassPathXmlApplicationContext
("com/nt/cfgs/applicationContext.xml");

//target Class
ActorMangServiceImpl actor=ctx.getBean("actorService",ActorMangServiceImpl.class);
try {
	//acess method
Actor act= new Actor();
act.setACTORID(1006);
act.setACTORNAME("vaidehi");
act.setACTORADDRESS("mumbai");
act.setPHONENO(8600872618L);
act.setREMUNERATION(56666.0f);
	String Result=actor.setRecord(act);
	System.out.println(Result);
}catch (DataAccessException e) {
e.printStackTrace();
}
	}

}
