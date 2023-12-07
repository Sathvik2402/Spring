package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="EMPLOYEE_TAB")
public class Employee {
	 
		
		@Column(name="EMP_ID")
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
	private Integer id;
		
		@Column(name="EMP_NAME",length=25)
	private String name;
		
		@Column(name="EMP_DESIGNATION",length=25)
	private String role;
		
		@Column(name="EMP_INCOME")
	private double income;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public double getIncome() {
			return income;
		}

		public void setIncome(double income) {
			this.income = income;
		}


	 
}
