 package com.darcoo.client;
 
  


 
import java.sql.DriverManager;
  
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.darcoo.entity.Employee;
 
public class EmployeeRunner {
	
	public static void main(String[]args) throws SQLException {
		
//      Persistent Object
		Employee ravi = new Employee(9,"Aman", "male",92000 );
		
//		Properties ps = new Properties();
//		
//		ps.put("user", "root");
//		ps.put("password", "root");
//		
//		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", ps);
//		
//		Statement statement = connection.createStatement();
//		
//     	statement.executeUpdate("insert into employee(id,name,gender,salary)value ("+ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
//		
//		
		
//		Multiple method  connection
		/*
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
		Statement statement = connection.createStatement();
		
     	statement.executeUpdate("insert into employee(id,name,gender,salary)value ("+ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
	
		*/
		
//		Method Chaining (in single method) connection
		
		DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root").createStatement().executeUpdate("insert into employee(id,name,gender,salary)value ("+ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
		 
		
		 
 
		System.out.println("insert into employee(id,name,gender,salary)value ("+ravi.getId()+ ",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
		System.out.println("Query executed....");
	}

}
