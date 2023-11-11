package com.techtree.service;

import java.util.List;

import com.techtree.entity.Employee;

public interface EmployeeService {
	
	 public Employee createEmployee(Employee emp);
	 
	    public Employee updateEmployee(Employee emp);
	    
	    public Employee getEmployee(Long empId);
	    
	    public void deleteEmployee(Long empId);
	    
	    public List<Employee> getAllEmployee();
	    
	    public List<Employee> getSalary(Integer salary);
	    
	    public List<Employee> getAge (Integer age);

}
