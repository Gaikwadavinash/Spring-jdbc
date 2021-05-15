package com.nt.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository("authDAO")
public class AuthenticationDAOImpl implements IAuthenticationDAO {

	@Autowired
	private SimpleJdbcCall sjd;
	
	public String authenticateUserList(String user, String pass) {
		//set pl/sq; procedure
		sjd.setProcedureName("P_AUTHENTICATION");
		
		//Map set param name and value
	//Map<String,Object> Inparam=Map.of("UNAME",user,"UPASS",pass);
	//execute the pl/sq; procedure
	//Map<String,Object> Outparam=sjd.execute(Inparam);
	//gather result
	//return (String)Outparam.get("RESULT");
		MapSqlParameterSource source= new MapSqlParameterSource();
		source.addValue("UNAME",user);
		source.addValue( "UPASS",pass);
		Map<String, Object> map1=sjd.execute(source);
		return (String)map1.get("RESULT");
	}

}
