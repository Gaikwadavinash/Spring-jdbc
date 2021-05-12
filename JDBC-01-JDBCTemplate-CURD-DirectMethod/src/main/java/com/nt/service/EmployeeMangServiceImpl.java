package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.nt.dao.IEmployeeDAO;

public class EmployeeMangServiceImpl implements IEmployeeMangService {

private IEmployeeDAO dao;
	
public EmployeeMangServiceImpl(IEmployeeDAO dao) {
this.dao=dao;
}	
/*
	public int fetchemployeeCount() {
	int count=dao.getEmpCount();
		return count;
	}

@Override
	public Float fetchSalarybyEmpNo(int eno) {
Float sal=dao.getEmpSalaryByEno(eno);
		return sal;
	}
	

@Override
	public Map<String, Object> fetchEmpDetailsByEno(int eno) {
		Map<String,Object> map=dao.getEmpDetailsByEno(eno);
		return map;
	}
	
@Override
	public List<Map<String, Object>> fetchEmpDetailsByDesg(String desg1, String desg2, String desg3) {
	List<Map<String,Object>> list=dao.getEmployeeDetailsByDesg(desg1, desg2, desg3);
		return list;
	}


@Override
	public SqlRowSet fetchEmpSalaryByRange(float startSal, float endSal) {
	SqlRowSet srs=dao.getEmployeeSalaryByRange(startSal, endSal);
		return srs;
	}
	

@Override
	public String insertRecordActor(String actorName, String actorAddress, Long phoneNo) {
	int count= dao.insertActotTable(actorName, actorAddress, phoneNo);
		return count==0?"Record are Not Inserted":"Record are Inserted Sucessfully::\n"+actorName+" "+actorAddress+" "+phoneNo;
	}
	

@Override
	public String updateActorRecord(String actorAddress,Long actorId) {
		int count=dao.updateActorTable(actorId, actorAddress);
		return count==0?"Record are Not Updated":"Record are updated Sucessfully"
			+" \n" +actorId+" "+actorAddress ;
	}
	*/

public String deleteActorRecordByRange(Float start, float end) {
		int count=dao.deleteActorRemuneration(start, start);
		return count==0?"Record are not deleted":"Record are deleted \n"+start+" "+end;
	}
}
