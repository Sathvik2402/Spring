package com.nt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Table
@Entity
@Data
public class Emp implements Serializable{

	@Id
	@SequenceGenerator(name = "gen1",initialValue = 1000,allocationSize = 1,sequenceName = "EMPNO_SEQ")
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer empno;
	@Column(length = 20)
	private String ename;
	@Column(length = 20)
	private String job;
	@Column
	private Float sal;
	@Column
	private Integer deptno;
}
