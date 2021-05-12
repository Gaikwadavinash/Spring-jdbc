package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public interface IEmployeeDAO {
//public int getEmpCount() ;
//public Float getEmpSalaryByEno(int eno);
//public Map<String,Object> getEmpDetailsByEno(int eno);	
//public List<Map<String, Object>> getEmployeeDetailsByDesg(String desg1,String desg2,String desg3);
//public SqlRowSet getEmployeeSalaryByRange(float startSalary,float endSalary );
//public int insertActotTable(String actorName,String actorAddress,long phoneNo);
//public int updateActorTable(Long actorId,String actorAddress);
public int deleteActorRemuneration(Float start,Float end);
}
