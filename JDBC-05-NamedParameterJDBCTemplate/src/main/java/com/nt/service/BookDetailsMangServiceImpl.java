package com.nt.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BookDetailsDAOImpl;
import com.nt.dao.IBookDetailsDAO;

import com.nt.model.BookDetails;
@Service("bookService")
public class BookDetailsMangServiceImpl implements IBookDetailsMangService {
@Autowired
	private IBookDetailsDAO dao;
	
public BookDetailsMangServiceImpl() {
	dao= new BookDetailsDAOImpl();
}/*
	@Override
	public BookDetails fetchBookdetailsBybId(int bId) {
	
//acess the DAO
		BookDetails book=dao.getBookDetails(bId);		
		//retrun value
		return book;
	}
*/


/*
@Override
	public List<BookDetails> fetchBookName(String bName1, String bName2, String bName3) {
	
	List<BookDetails> details=dao.getBookDataByBookName(bName1, bName2, bName3);
		return details;
	}
	*/

@Override
	public String insertRecord(BookDetails details) {
	int count=dao.insertBookDetails(details);
		return count==0?"Not Inserted Records Sucessfully":"Record Inserted Sucessfully\n"+details;
	}




}
