package com.techtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techtree.entity.Employee;
import com.techtree.service.EmployeeService;

@RestController
public class EmployeeController {
	
	 @Autowired
	    private EmployeeService employeeService;
	 
	 @PostMapping("/addEmployee")
	    public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
		 Employee employee = employeeService.createEmployee(emp);
	        return new ResponseEntity<>(employee, HttpStatus.CREATED);
	    }
	 
	 @PutMapping("/employee/{id}")
	    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee emp) {
		 emp.setId(id);
		 Employee updateEmployee = employeeService.updateEmployee(emp);
	        return new ResponseEntity<>(updateEmployee, HttpStatus.CREATED);
	    }
	 
	 @DeleteMapping("/employee/{empId}")
	    public ResponseEntity<String> deleteEmployee(@PathVariable(value = "empId") Long empId) {
	        employeeService.deleteEmployee(empId);
	        return new ResponseEntity<>("Employee with EmployeeId : " + empId + " deleted successfully", HttpStatus.OK);
	    }
	 
	 @GetMapping("/employee/{empId}")
	    public ResponseEntity<Employee> getEmployee(@PathVariable(value = "empId") Long empId) {
	        return new ResponseEntity<>(employeeService.getEmployee(empId), HttpStatus.OK);
	    }
	 
	 @GetMapping("/getEmployees")
	    public ResponseEntity<List<Employee>> getAllEmployees() {
	        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
	    }
	  
	 @GetMapping("/getSalary/{salary}")
	    public ResponseEntity<List<Employee>> getEmployeeBySalary(@PathVariable(value = "salary") Integer salary) {
	        return new ResponseEntity<>(employeeService.getSalary(salary), HttpStatus.OK);
	    }
	 
	 @GetMapping("/getAge/{age}")
	    public ResponseEntity<List<Employee>> getEmployeeByAge(@PathVariable(value = "age") Integer age) {
	        return new ResponseEntity<>(employeeService.getAge(age), HttpStatus.OK);
	    }

}
