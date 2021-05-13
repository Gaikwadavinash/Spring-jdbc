package com.nt.service;

import java.util.List;

import com.nt.model.BookDetails;

public interface IBookDetailsMangService {
//public BookDetails fetchBookdetailsBybId(int bId);
//public List<BookDetails> fetchBookName(String bName1,String bName2,String bName3);
public String insertRecord(BookDetails details);
}
