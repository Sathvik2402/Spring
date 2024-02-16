package com.nt.model;

import java.io.Serializable;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Table(name="EMPLOYEE1")
@Entity
@Data
@SQLDelete(sql="UPDATE EMPLOYEE1 SET STATUS='INACTIVE' WHERE EMPNO=?")
//@Where(clause="STATUS <> 'INACTIVE'")
@SQLRestriction("STATUS <> 'INACTIVE'")
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
	@Column(length=20)
	private String status="ACTIVE";
}
