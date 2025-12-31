package com.darcoo.dao;

import java.util.List;

import com.darcoo.entity.Employee;

public interface EmployeeDao{
	
	public void saveEmp(Employee e);
	
	public void updateEmp(Employee e);
	
	public void deleteEmpById(int id);
	
	public Employee getEmpById(int id);

	public Employee saveEmpByName(String name);
	
	public  List<Employee> getAllEmps ();
	
	public void printAllEmps();
	
	
}
