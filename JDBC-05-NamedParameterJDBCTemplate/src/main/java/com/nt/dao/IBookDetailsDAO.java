package com.nt.dao;

import java.util.List;

import com.nt.model.BookDetails;

public interface IBookDetailsDAO {
//public BookDetails getBookDetails(int bId);
//public List<BookDetails> getBookDataByBookName(String bName1,String bName2,String bName3);
public int insertBookDetails(BookDetails details);
}
