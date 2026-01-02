package com.darcoo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.darcoo.entity.Employee;

public class EmployeeDaolmpl  implements EmployeeDao {
	
	private static final String INSERT_QUERY = "INSERT INTO EMPLOYEE ( ID, NAME,GENDER,SALARY) VALUES (%d,'%s','%s',%d)";
	private static final String UPDATE_QUERY = "UPDATE EMPLOYEE SET NAME = '%s', GENDER = '%s', SALARY= '%d' WHERE Id = %d";
	private static final String DELETE_QUERY = "DELETE FROM EMPLOYEE WHERE ID = %d";
	private static final String SELECT_QUERY = "SELECT * FROM EMPLOYEE ";
	
	static Connection connection = null;
	
	static {
		
		try {
		 connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override  
	public void saveEmp(Employee e) {

		try (Statement statement = connection.createStatement()){
			
			statement.executeUpdate(String.format(INSERT_QUERY ,e.getId(),e.getName(),e.getGender(),e.getSalary()));
			System.out.println ("  insert into employee(id,name,gender,salary)value(" + e.getId()+ ",'"+e.getName()+"','"+e.getGender()+"',"+e.getSalary()+")");
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	
	}

	@Override
	public void updateEmp(Employee e) throws SQLException
	{		
//		Second Aproach
		
			Statement statement = connection.createStatement();
			statement.executeUpdate(String.format(UPDATE_QUERY  ,e.getName(),e.getGender(),e.getSalary(),e.getId()));
			System.out.println  (String.format(UPDATE_QUERY  ,e.getName(),e.getGender(),e.getSalary(),e.getId()));
	
		/*
//		 First Aproach

		try (Statement statement = connection.createStatement()){
			statement.executeUpdate(String.format(UPDATE_QUERY  ,e.getName(),e.getGender(),e.getSalary(),e.getId()));
			System.out.println  (String.format(UPDATE_QUERY  ,e.getName(),e.getGender(),e.getSalary(),e.getId()));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		 */
		
	}

	@Override
	public void deleteEmpById(int id) throws SQLException {
		
		Statement statement = connection.createStatement();
		statement.executeUpdate(String.format(DELETE_QUERY,id));
		System.out.println  (String.format(DELETE_QUERY  ,id));	
	}

	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee saveEmpByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAllEmps() throws SQLException {

		Statement statement = connection.createStatement();
	//	statement.executeUpdate(SELECT_QUERY);
    //	statement.executeUpdate("SELECT * FROM EMPLOYEE ");
		String SELECT_QUERY = "SELECT * FROM EMPLOYEE";
	
		ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
		

		while(resultSet.next()) 
	    {
		System.out.println("ID = "+resultSet.getInt(1)+ "\t NAME = " + resultSet.getString(2)+"\t GENDER = "+resultSet.getString("gender")+"\t SALARY = "+resultSet.getInt(4)  );	
		}
		
		System.err.println(SELECT_QUERY);
		
	}
	
}
