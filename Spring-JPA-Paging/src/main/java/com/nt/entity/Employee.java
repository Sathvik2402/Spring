package com.nt.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="EMP")
public class Employee {
	@Id
	@Column(name="EMPNO")
	private Integer empno;
	@Column(name="ENAME")
	private String ename;
	@Column(name="JOB")
	private String job;
	@Column(name="MGR")
	private Integer mgr;
	@Column(name="HIREDATE")
	private Date hiredate;
	@Column(name="SAL")
	private Integer sal;
	@Column(name="COMM")
	private Integer comm;
	@Column(name="DEPTNO")
	private Integer deptno;
}
