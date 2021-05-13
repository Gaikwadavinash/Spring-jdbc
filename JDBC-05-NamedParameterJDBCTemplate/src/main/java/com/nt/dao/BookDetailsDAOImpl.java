package com.nt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import com.nt.model.BookDetails;

@Repository("bookDAO")
public class BookDetailsDAOImpl implements IBookDetailsDAO {
//private  static final String Get_Book_Details_By_bId="SELECT BID,BCODE,BNAME,BAUTHOR,BPRICE,BQTY,STATUS FROM BOOKDETAILS WHERE BID=:id" ;
//private static final String Get_Book_By_BName= "SELECT BID,BCODE,BNAME,BAUTHOR,BPRICE,BQTY,STATUS FROM BOOKDETAILS WHERE BNAME IN(:type1,:type2,:type3)";
private static final String Set_Insert_Record_BooDetails="INSERT INTO BOOKDETAILS VALUES(:bCode, :bName,:bAuthor, :bPrice, :bQty, :status,BOOK_SEQ_BID.NEXTVAL )";

@Autowired	
private NamedParameterJdbcTemplate npjt;
/*
@Override
	public BookDetails getBookDetails(int bId) {
	/*	
	BookDetails details=npjt.queryForObject(Get_Book_Details_By_bId,//args1
	
			//args2
			Map.of("id",bId),
		
		//args3	
			(rs,rowNum)->{
		//copy the data resultset to model class
		BookDetails 	book= new BookDetails();
		book.setBId(rs.getInt(1));
		book.setBCode(rs.getString(2));
		book.setBName(rs.getString(3));
		book.setBAuthor(rs.getString(4));
        book.setBPrice(rs.getFloat(5));
        book.setBQty(rs.getInt(6));
        book.setStatus(rs.getString(7));
		return 	book;
	});

		
			BookDetails details=npjt.queryForObject(Get_Book_Details_By_bId,//args1
					
					//args2
					Map.of("id",bId),
			new BeanPropertyRowMapper<BookDetails>(BookDetails.class));
	
		return details;
	}


//return details;
//}
*/

/*
@Override
	public List<BookDetails> getBookDataByBookName(String bName1, String bName2, String bName3) {
	//prepare  SqlParameterSource object having named params and values
	MapSqlParameterSource source= new MapSqlParameterSource();
	source.addValue("type1", bName1);
	source.addValue("type2", bName2);
	source.addValue("type3", bName3);
	
	//List<BookDetails> details=npjt.query(Get_Book_By_BName,source,
	//		 new RowMapperResultSetExtractor<BookDetails>( new BeanPropertyRowMapper(BookDetails.class)));
		//return details;
	
	
	List<BookDetails> details=npjt.query(Get_Book_By_BName,source,
			rs->{
		List<BookDetails> book= new ArrayList();
				while(rs.next()) {
					BookDetails bo= new BookDetails();
					bo.setBId(rs.getInt(1));
					bo.setBName(rs.getString(2));
					bo.setBCode(rs.getString(3));
					bo.setBAuthor(rs.getString(4));
					bo.setBPrice(rs.getFloat(5));
					bo.setBQty(rs.getInt(6));
					bo.setStatus(rs.getString(7));
					book.add(bo);
				}
				return book;
			});
				return details;
	}
	*/


@Override
	public int insertBookDetails(BookDetails details) {
	BeanPropertySqlParameterSource bpsqlp= new BeanPropertySqlParameterSource(details);
	int count=npjt.update(Set_Insert_Record_BooDetails,bpsqlp);
		return count;
	}

}
