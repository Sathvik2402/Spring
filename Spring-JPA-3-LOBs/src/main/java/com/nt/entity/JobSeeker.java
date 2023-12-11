package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Table(name="JPA_JOB_SEEKER_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSeeker implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer jsId;
	@Column(length=20) 
	private String jsName;
	@Column
	private String jsQlfy;
	@Lob
	private byte[] photo;
	@Lob
	private char[] resume;

	private boolean indian;
}
