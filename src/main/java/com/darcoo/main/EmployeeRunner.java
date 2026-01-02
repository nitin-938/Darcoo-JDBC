package com.darcoo.main;

import java.sql.SQLException;

import com.darcoo.dao.EmployeeDao;
import com.darcoo.dao.EmployeeDaolmpl;
import com.darcoo.entity.Employee;


 
public class EmployeeRunner {

	public static void main(String[]args) throws SQLException {
		
		EmployeeDao edao = new EmployeeDaolmpl();
		  
		Employee emp = new Employee(8,"anshu", "male",44000 );
	
//		edao.saveEmp(emp);
//		edao.updateEmp(emp);
		edao.deleteEmpById(3);
		edao.select
		
		
		
		System.out.println(); 
		
		
		
		System.out.println("Query executed....");
	}

}

	


