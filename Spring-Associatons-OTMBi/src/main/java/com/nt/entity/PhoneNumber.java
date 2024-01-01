package com.nt.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="OTM_BI_PHONENUMBER")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class PhoneNumber {
	@Id
	@SequenceGenerator(name="gen1", sequenceName="regno_seq",initialValue=1,allocationSize=1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
private Integer regno;
	
	@NonNull
	private Long mobileno;
	
	@Column(length = 20)
	@NonNull
	private String provider;
	
	@Column(length = 20)
	@NonNull
	private String numberType;

	//many-one
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.ALL)
	@JoinColumn(name="person_id",referencedColumnName="pid")// this specifies the foreign key in child class entity
private Person person;

	@Override
	public String toString() {
		return "PhoneNumber [regno=" + regno + ", mobileno=" + mobileno + ", provider=" + provider + ", numberType="
				+ numberType + "]";
	}
	
	
	
}
