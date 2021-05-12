package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMangService;

public class JdbcCallBackMethodTest {

	public static void main(String[] args) {
ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");	
try {
IEmployeeMangService service=ctx.getBean("empService", IEmployeeMangService.class);	
	//System.out.println(service.fetchEmployee(7499));

List<EmployeeDTO> List=service.fetchEmployeeByDesg("CLERK","MANAGER", "SALESMAN");
List.forEach(System.out::println);
}catch (DataAccessException dae) {
dae.printStackTrace();
}

	}

}
