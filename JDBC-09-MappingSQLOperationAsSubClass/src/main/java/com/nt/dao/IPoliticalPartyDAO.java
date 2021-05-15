package com.nt.dao;

import java.util.List;

import com.nt.model.PoliticalParty;

public interface IPoliticalPartyDAO {
//public  PoliticalParty getPolicalPartyDetailsById(int partyId);
//public List<PoliticalParty> getPartyDetailsByName(String party1,String party2,String party3);
public int updateFlagColorsByPartyName(String partyName,String partyColors);
}
