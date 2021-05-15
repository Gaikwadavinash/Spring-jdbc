package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IPoliticalPartyDAO;
import com.nt.dao.PoliticalPartyDAOImpl;
import com.nt.model.PoliticalParty;
@Service("politicalService")
public class PoliticalPartyMangServiceImpl implements IPoliticalPartyMangService {

	@Autowired
private IPoliticalPartyDAO dao;
	
/*
	@Override
	public PoliticalParty fetchByPoliticalId(int partyId) {
		PoliticalParty party=dao.getPolicalPartyDetailsById(partyId);
		return party;
	}
*/
	
	/*
	@Override
	public List<PoliticalParty> fetchPartyName(String party1, String party2, String party3) {
	List<PoliticalParty> party=dao.getPartyDetailsByName(party1, party2, party3);
		return party;
	}
	*/
	@Override
	public String fetchUpadatePartyNameByFlag(String partyName, String partyColors) {
int count=dao.updateFlagColorsByPartyName(partyName, partyColors);
		return count==0?"Record are Not Updated":"Record are Updated";
	}
}
