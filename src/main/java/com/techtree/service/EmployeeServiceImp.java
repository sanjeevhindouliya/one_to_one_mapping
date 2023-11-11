package com.techtree.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtree.entity.Employee;
import com.techtree.repository.EmployeeRepository;



@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
    private EmployeeRepository employeeRepository;
	    
	@Override
	public Employee createEmployee(Employee emp) {
		
		return employeeRepository.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return employeeRepository.save(emp);
	}

	@Override
	public Employee getEmployee(Long empId) {
		 Optional<Employee> findById = employeeRepository.findById(empId);
		 if (findById.isPresent()) {
	            return findById.get();
	        }
	        
		return null;
	}

	@Override
	public void deleteEmployee(Long empId) {
		 employeeRepository.deleteById(empId);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return  employeeRepository.findAll();
	}

	@Override
	public List<Employee> getSalary(Integer salary) {
		
		return employeeRepository.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getAge(Integer age) {
		
		return employeeRepository.findByAgeLessThan(age);
	}

}
