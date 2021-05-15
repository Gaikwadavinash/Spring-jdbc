package com.nt.service;

import java.util.List;

import com.nt.model.PoliticalParty;

public interface IPoliticalPartyMangService {
//public PoliticalParty fetchByPoliticalId(int partyId);
//public List<PoliticalParty> fetchPartyName(String party1,String party2,String party3);
public String fetchUpadatePartyNameByFlag(String partyName,String partyColors);
}
