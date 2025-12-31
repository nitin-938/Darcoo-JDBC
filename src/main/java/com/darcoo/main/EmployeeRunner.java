package com.darcoo.main;

import com.darcoo.dao.EmployeeDao;
import com.darcoo.dao.EmployeeDaolmpl;
import com.darcoo.entity.Employee;


 
public class EmployeeRunner {

	public static void main(String[]args) {
		
		EmployeeDao edao = new EmployeeDaolmpl();
		  
		Employee emp = new Employee(5,"Himanshu", "male",80000 );
	
//		edao.saveEmp(emp);
		edao.updateEmp(emp);
		
		
		
		
		
		System.out.println(); 
		
		
		
		System.out.println("Query executed....");
	}

}

	


