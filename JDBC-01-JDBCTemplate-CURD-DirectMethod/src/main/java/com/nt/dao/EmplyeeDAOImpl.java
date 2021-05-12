package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class EmplyeeDAOImpl implements IEmployeeDAO {
//private static final String GET_Emp_Count="SELECT COUNT(*) FROM EMP";
//private static final String GET_Emp_Sal_by_Eno="SELECT SAL FROM EMP WHERE EMPNO=?";
//private static final String GET_Emp_Details_By_Eno="SELECT EMPNO,ENAME,SAL,JOB,DEPTNO FROM EMP WHERE EMPNO=?";
//private static final String GET_Emp_Details_By_Desg="SELECT EMPNO,ENAME,SAL,JOB,COMM FROM EMP WHERE JOB IN(?,?,?)";	
//private static final String GET_EMP_Salary_by_Range="SELECT ENAME,SAL FROM EMP WHERE SAL>=? AND SAL<=?";	
//private static final String SET_Actor_Record="INSERT INTO ACTOR(ACTORID,ACTORNAME,ACTORADDRESS,PHONENO) VALUES(ACTOR_ID_SEQ.NEXTVAL,?,?,?)";
//private static final String SET_UPDATE_RECORD="UPDATE ACTOR SET  ACTORADDRESS=? WHERE ACTORID=? ";
private static final String GET_Actor_by_Range_SAL="DELETE FROM ACTOR  WHERE REMUNERATION >=? and REMUNERATION<=?";
	
	
	private JdbcTemplate jt;

public EmplyeeDAOImpl( JdbcTemplate jt) {
	 this.jt=jt;
}
/*
public int getEmpCount() {
int count=jt.queryForObject(GET_Emp_Count, Integer.class);
		return count;
	}

@Override
	public Float getEmpSalaryByEno(int eno) {
	Float sal=jt.queryForObject(GET_Emp_Sal_by_Eno, Float.class,eno);
		return sal;
	}
@Override
	public Map<String, Object> getEmpDetailsByEno(int eno) {
		Map<String,Object> map=jt.queryForMap(GET_Emp_Details_By_Eno,eno);
		return map;
	}


@Override
	public List<Map<String,Object>> getEmployeeDetailsByDesg(String desg1, String desg2, String desg3) {
	List<Map<String,Object>> list=jt.queryForList(GET_Emp_Details_By_Desg,desg1,desg2,desg3);
		return list;
	}
	
	

@Override
	public SqlRowSet getEmployeeSalaryByRange(float startSalary, float endSalary) {
		SqlRowSet srs=jt.queryForRowSet(GET_EMP_Salary_by_Range,startSalary,endSalary);
		return srs;
	}

public int insertActotTable(String actorName, String actorAddress, long phoneNo) {
		int count=jt.update(SET_Actor_Record,actorName,actorAddress,phoneNo);
		return  count;
	}
	
@Override
	public int updateActorTable(Long actorId, String actorAddress) {
int count=jt.update(SET_UPDATE_RECORD,actorAddress,actorId);
return count;	
}
	*/

@Override
	public int deleteActorRemuneration(Float start, Float end) {
	int count=jt.update(GET_Actor_by_Range_SAL,start,end);
		return count;
	}


}

