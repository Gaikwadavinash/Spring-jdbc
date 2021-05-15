package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IActorDAO;
import com.nt.model.Actor;

@Service("actorService")
public class ActorMangServiceImpl implements IActorMangService {

	@Autowired
	private IActorDAO dao;
	
	@Override
	public String setRecord(Actor actor) {
//acess dao
		int count=dao.insertRecord(actor);
		return  count==0?"Record are Not Inserted":"Record are Inserted\n"+actor;
	}

}
