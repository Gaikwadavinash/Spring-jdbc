package com.nt.test;

import javax.sql.RowSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.nt.service.EmployeeMangServiceImpl;
import com.nt.service.IEmployeeMangService;

public class JDBCTemplateTest {

	public static void main(String[] args) {
	//create IOC container
		ApplicationContext ctx=
			new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//create target Class Object
//EmployeeMangServiceImpl empService=ctx.getBean("empService",EmployeeMangServiceImpl.class);
IEmployeeMangService empService=ctx.getBean("empService",IEmployeeMangService.class);
		try {
			//1 Method call count
	//System.out.println("Count:"+empService.employeeCount());
			//2 Method call salary
		//System.out.println("Sal by EmpNo 7499 is :"+empService.getSalarybyEmpNo(7499));	
//3 Method call
		//Method call details
			//System.out.println("Emp Record 7900 is"+empService.fetchEmpDetailsByEno(7900));
		
	// 4 method call desgbyemp(1,2,3)	
			//System.out.println(empService.fetchEmpDetailsByDesg("CLERK", "SALESMAN", "MANAGER")
		/*
			empService.fetchEmpDetailsByDesg("CLERK", "SALESMAN", "MANAGER")
				.forEach(map->{
			map.entrySet().forEach(row->{
		System.out.println(row.getKey()+"  "+row.getValue());
			});
			System.out.println(" ");
		});
		*/
			
	//5 method call
		/*
                       SqlRowSet  rs  =empService.fetchEmpSalaryByRange(900.0f, 2300.0f);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getFloat(2));
		}
		}catch (DataAccessException de) {
			de.printStackTrace();
		}
		*/
	/*		
//6 Method call
String Result=	empService.insertRecordActor("mansai"," mumbai", 7875438596L);	
		System.out.println(Result);	
		}
		*/
/*			
//method call 7
		String Result =empService.updateActorRecord("Banglore",1001L);	
		System.out.println(Result);
	*/
	
//method call 8
	String Result=empService.deleteActorRecordByRange(58.0f, 59.0f);		
		System.out.println(Result);
		}catch (Exception e) {
e.printStackTrace();
}
	
	
	
	}

}
