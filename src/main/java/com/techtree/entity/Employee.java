package com.techtree.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employeedtls")

public class Employee {
	
	   @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="Id")
	    private Long id;
	    
	    @Column(name="EmployeeName")
	    private String employeeName;
	    
	    @Column(name="EmployeeCode")
	    private String employeeCode;
	    
	    @Column(name="Designation")
	    private String designation;
	    
	    @Column(name = "salary")
	    private Integer salary;
	    
	    @Column(name = "age")
	    private Integer age;
	    
	    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinColumn(name="addressid")
	    private Address address;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(Long id, String employeeName, String employeeCode, String designation, Integer salary,
				Integer age, Address address) {
			super();
			this.id = id;
			this.employeeName = employeeName;
			this.employeeCode = employeeCode;
			this.designation = designation;
			this.salary = salary;
			this.age = age;
			this.address = address;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public String getEmployeeCode() {
			return employeeCode;
		}

		public void setEmployeeCode(String employeeCode) {
			this.employeeCode = employeeCode;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public Integer getSalary() {
			return salary;
		}

		public void setSalary(Integer salary) {
			this.salary = salary;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeCode=" + employeeCode
					+ ", designation=" + designation + ", salary=" + salary + ", age=" + age + ", address=" + address
					+ "]";
		}

	    
	    
}
