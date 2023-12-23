package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="EMPLOYEE_TAB")
@Data
public class Employee {

	@Id
	@Column(name="emp_id")
	private Integer empno;
	@Column(name="emp_name")
	private String ename;
	@Column(name="emp_designation")
	private String job;
	@Column(name="emp_income")
	private Double income;
}
