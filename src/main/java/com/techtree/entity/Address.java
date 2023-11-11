package com.techtree.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")

public class Address {
	
	    @Id
	    @Column(name="id")
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
	    
	    @Column(name="doornumber")
	    private String doorNumber;
	    
	    @Column(name="street")
	    private String street;
	    
	    @Column(name="city")
	    private String city;
	    
	    @OneToOne(mappedBy="address" , cascade = CascadeType.ALL ,fetch = FetchType.EAGER)  
	    @JsonIgnore
	    private Employee empList;

		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Address(int id, String doorNumber, String street, String city, Employee empList) {
			super();
			this.id = id;
			this.doorNumber = doorNumber;
			this.street = street;
			this.city = city;
			this.empList = empList;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDoorNumber() {
			return doorNumber;
		}

		public void setDoorNumber(String doorNumber) {
			this.doorNumber = doorNumber;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Employee getEmpList() {
			return empList;
		}

		public void setEmpList(Employee empList) {
			this.empList = empList;
		}

		@Override
		public String toString() {
			return "Address [id=" + id + ", doorNumber=" + doorNumber + ", street=" + street + ", city=" + city
					+ ", empList=" + empList + "]";
		}
	    
	   

}
