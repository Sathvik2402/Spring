package com.nt.entity;


import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="OTM_BI_PERSON")
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer pid;
@NonNull
@Column(length = 20)
private String pname;
@NonNull
@Column(length = 20)
private String paddr;

@OneToMany(targetEntity = PhoneNumber.class,cascade=CascadeType.ALL,mappedBy = "person")
//@JoinColumn(name="person_id",referencedColumnName="pid")// this specifies the foreign key in child class entity
private List<PhoneNumber> phones;

@Override
public String toString() {
	return "Person [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr  + "]";
}




}
