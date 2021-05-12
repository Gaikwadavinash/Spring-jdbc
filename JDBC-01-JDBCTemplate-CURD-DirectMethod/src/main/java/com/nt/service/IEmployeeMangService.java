package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public interface IEmployeeMangService {
//public int fetchemployeeCount();
//public Float fetchSalarybyEmpNo(int eno);
//public Map<String,Object> fetchEmpDetailsByEno(int eno);
//public List<Map<String,Object>> fetchEmpDetailsByDesg(String desg1,String desg2,String desg3);
//public SqlRowSet fetchEmpSalaryByRange(float startSal,float endSal);
//public String insertRecordActor(String actorName,String actorAddress,Long phoneNo);
//public String updateActorRecord(String actorAddress,Long actorId);
public String deleteActorRecordByRange(Float start,float end);
}
