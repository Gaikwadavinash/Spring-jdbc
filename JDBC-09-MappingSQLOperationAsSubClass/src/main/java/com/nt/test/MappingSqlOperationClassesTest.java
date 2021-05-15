package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.PoliticalParty;
import com.nt.service.IPoliticalPartyMangService;

public class MappingSqlOperationClassesTest {

	public static void main(String[] args) {
	//create IOc Conatiner
		ApplicationContext ctx= new ClassPathXmlApplicationContext
				("com/nt/cfgs/applicationContext.xml");
		
//target Class Object
	IPoliticalPartyMangService service= ctx.getBean("politicalService",IPoliticalPartyMangService.class);
	try {
	//PoliticalParty party1=service.fetchByPoliticalId(103);	
	//System.out.println(party1);	
	//PoliticalParty party2=service.fetchByPoliticalId(102);	
	//System.out.println(party2);	
	//List<PoliticalParty> party5=service.fetchPartyName("INC","Bjp", "Aap");

		//party5.forEach(par->{
			//System.out.println(par);		
		//});
String Result=service.fetchUpadatePartyNameByFlag("black","Bjp");
System.out.println(Result);

		
	}catch (DataAccessException e) {
		e.printStackTrace();
	}
	
	((AbstractApplicationContext) ctx).close();
	}

}
