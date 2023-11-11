package com.techtree.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.techtree.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query("SELECT e FROM Employee e WHERE e.salary >= ?1")
	List<Employee> findBySalaryGreaterThan(Integer salary);
	
	@Query("SELECT e FROM Employee e WHERE e.age <= ?1")
	List<Employee> findByAgeLessThan(Integer age);
}
