package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.BookDetails;
import com.nt.service.IBookDetailsMangService;

public class NamedParamterJDBCTemplateTest {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		try {
			//craete Object of Service classs
	IBookDetailsMangService	service=ctx.getBean("bookService",IBookDetailsMangService.class);
	
		//BookDetailsMangServiceImpl	service=ctx.getBean("bookService",BookDetailsMangServiceImpl.class);
//System.out.println(	service.fetchBookdetailsBybId(1010));		
/*
	List<BookDetails>	 details=service.fetchBookName("C++"," oracle", "JAVA");
details.forEach(det->{
System.out.println(det);
});
System.out.println();
*/
	BookDetails details= new BookDetails();
	
	details.setBCode("kkkll");
	details.setBName("vai");
	details.setBAuthor("vaidu");
	details.setBPrice(150.0f);
	details.setBQty(10);
	details.setStatus("Available");
	
	String Result=service.insertRecord(details);
	System.out.println(Result);
		}catch (DataAccessException e) {
e.printStackTrace();
		}

	}

}
