package com.nt.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepo;
import com.nt.repository.IPhoneNumRepo;

@Service
public class OTMBiMgmtServiceImpl implements OTMBiMgmtService{
	@Autowired
	private IPersonRepo prepo;
	@Autowired
	private IPhoneNumRepo nrepo;
	
	@Override
	public void saveDateUsingParent() {
		// TODO Auto-generated method stub
//		create child obj
		PhoneNumber ph1=new PhoneNumber(11223345L,"airtel","office");
		PhoneNumber ph2=new PhoneNumber(10214520L,"airtel","home");
		
//		create parent obj
		Person p=new Person("Ron","Hyd");
		
//		assign parent
		ph1.setPerson(p);ph2.setPerson(p);
//		assign child obj
		p.setPhones(List.of(ph1,ph2));
		
//		save obj
		int idval=prepo.save(p).getPid();System.out.println(idval);
	}
@Override
	public void saveDataUsingChild() {
//	create child obj
	PhoneNumber ph1=new PhoneNumber(11223345L,"idea","office");
	PhoneNumber ph2=new PhoneNumber(10214520L,"jio","home");
	
//	create parent obj
	Person p=new Person("motu","furfuripur");
	
//	assign parent
	ph1.setPerson(p);ph2.setPerson(p);
//	assign child obj
	p.setPhones(List.of(ph1,ph2));
	
//	save obj
	int idval=nrepo.save(ph1).getPerson().getPid();
	int idval2=nrepo.save(ph2).getPerson().getPid();
	System.out.println(idval+" "+idval2+" person saved with phone numbers"+ph1.getMobileno()+"and"+ph2.getMobileno());  
	
	}
@Override
public void loadDataUsingParent() {
	
	List<Person> li=prepo.findAll();
	li.forEach(person->{
		System.out.println(person.getPname());
		System.out.println(person.getPhones().toString());
	});
}
}
