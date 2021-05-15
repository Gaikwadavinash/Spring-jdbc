package com.nt.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;
@Repository("politicalDAO")
public class PoliticalPartyDAOImpl implements IPoliticalPartyDAO{
//private static final String Get_PartyDeatils_by_PartyId="SELECT PARTYID,FLAGCOLORS,PARTYNAME,PARTYSYMBOL FROM POLITICALPARTY WHERE PARTYID=?";
//private static final String Get_PartyDeatils_by_PartyName="SELECT PARTYID,FLAGCOLORS,PARTYNAME,PARTYSYMBOL FROM POLITICALPARTY WHERE PARTYNAME IN(?,?,?)";
private static final String updatePartyFlag="UPDATE POLITICALPARTY SET  FLAGCOLORS=? WHERE PARTYNAME=?";
	//private PoliticalPartySelector1  selector1;
//private PoliticalPartySelector2 selector2;
private PoliticalPartyUpdate update1;
	//dao class contructor inject ds
@Autowired
public PoliticalPartyDAOImpl(DataSource ds) {
	//selector1= new PoliticalPartySelector1(ds,Get_PartyDeatils_by_PartyId);
//selector2= new PoliticalPartySelector2(ds, Get_PartyDeatils_by_PartyName);
update1= new PoliticalPartyUpdate(ds,updatePartyFlag);
}


/*
@Override
	public PoliticalParty getPolicalPartyDetailsById(int partyId) {
	PoliticalParty party2=selector1.findObject(partyId);
		return party2;
	}


//Inner SubClass
public static class PoliticalPartySelector1 extends MappingSqlQuery<PoliticalParty>{
public PoliticalPartySelector1(DataSource ds,String query) {
super(ds,query);
super.declareParameter(new SqlParameter(Types.INTEGER));
super.compile();
}
	@Override
	public PoliticalParty mapRow(ResultSet rs, int rowNum) throws SQLException {
		//Copy the rs to model class
		PoliticalParty party= new PoliticalParty();
		party.setPartyId(rs.getInt(1));
		party.setFlagColors(rs.getString(2));
		party.setPartyName(rs.getString(3));
		party.setPartySymbol(rs.getString(4));
		return party;
	}
}//end Inner Subclass
/*

/*

	public List<PoliticalParty> getPartyDetailsByName(String party1, String party2, String party3) {
		List<PoliticalParty> part=selector2.execute(party1,party2,party3);		
		return part;
	}




//Inner class query2
public  static  class PoliticalPartySelector2 extends MappingSqlQuery<PoliticalParty>{

	public PoliticalPartySelector2(DataSource ds,String query) {
		super(ds,query);
		super.declareParameter( new SqlParameter(Types.VARCHAR));
		super.declareParameter( new SqlParameter(Types.VARCHAR));
		super.declareParameter( new SqlParameter(Types.VARCHAR));
		super.compile();
	}
	@Override
public PoliticalParty mapRow(ResultSet rs, int rowNum) throws SQLException {
	//copy result to model class
		PoliticalParty party2= new PoliticalParty();
		party2.setPartyId(rs.getInt(1));
		party2.setFlagColors(rs.getString(2));
		party2.setPartyName(rs.getString(3));
		party2.setPartySymbol(rs.getString(4));	
		return party2;
	}
}//end inner subclass
*/

	public int updateFlagColorsByPartyName(String partyName,String partyColors) {
		int count=update1.update(partyName,partyColors);
		return count;
	}

public static class PoliticalPartyUpdate extends SqlUpdate{
	public PoliticalPartyUpdate(DataSource ds,String Query) {
		super(ds,Query);
		super.declareParameter( new SqlParameter(Types.VARCHAR));
		super.declareParameter( new SqlParameter(Types.VARCHAR));
		super.compile();
	}
}

}