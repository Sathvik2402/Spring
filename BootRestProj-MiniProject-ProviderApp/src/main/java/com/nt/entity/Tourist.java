package com.nt.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="REST_JPA_TOURIST")
public class Tourist {
	
	@Id
	@SequenceGenerator(name = "gen", sequenceName = "TID_SEQ",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen",strategy = GenerationType.SEQUENCE)
	private Integer tid;
	
	@Column(length=30)
	@NonNull
	private String tname;

	
	@Column(length=20)
	@NonNull
	private String city;
	
	
	@Column(length=20)
	@NonNull
	private String packageType;
	
	@NonNull
	private Float budget;
	
	@NonNull
	private LocalDate startFrom;
	
	@NonNull
	private LocalDate endOn;
}
