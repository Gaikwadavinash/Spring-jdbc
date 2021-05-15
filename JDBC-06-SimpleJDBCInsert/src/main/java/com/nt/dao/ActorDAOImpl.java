package com.nt.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.model.Actor;
@Repository("actorDAO")
public class ActorDAOImpl implements IActorDAO {
@Autowired
private SimpleJdbcInsert sji;	
	
	/*
	@Override
	public int insertRecord(Actor actor) {
	//to set the table Name
	sji.setTableName("Actor");
	//gives the column and values
	Map<String, Object> intrecords=Map.of(
		"ACTORID"	,actor.getACTORID(),
		"ACTORNAME",actor.getACTORNAME(),
		"ACTORADDRESS",actor.getACTORADDRESS(),
		"PHONENO",actor.getPHONENO(),
		"REMUNERATION",actor.getREMUNERATION()
			);
	
		int count=sji.execute(intrecords);	
	*
	*/


public int insertRecord(Actor actor) {
	//set thetable name
	sji.setTableName("Actor");
	
	int count=sji.execute( new BeanPropertySqlParameterSource(actor));
	

		return count;
}

}
