package com.darcoo.main;

import java.sql.SQLException;
import com.darcoo.dao.EmployeeDao;
import com.darcoo.dao.EmployeeDaolmpl;
import com.darcoo.entity.Employee;


 
public class EmployeeRunner {

	public static void main(String[]args) throws SQLException {
		
		EmployeeDao edao = new EmployeeDaolmpl();
		  
	 	Employee emp = new Employee(8,"anshu", "male",44000 );
 
		
	//	edao.printAllEmps();
	//	System.out.println(edao.getEmpById(8));
	//	System.out.println(edao.getEmpByName("khushi"));
		
		edao.printEmpByName("vikas");
		
		System.out.println("Query executed....");
	}

}

	


