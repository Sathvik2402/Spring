package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;


import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	IEmployeeService serv;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	try {
		Page<Employee> p=serv.getEmployeeRecordsByPages(6, 2, false, "empname");
		System.out.println("page number :"+p.getNumber());
		System.out.println("Totalpages :"+p.getTotalPages());
		System.out.println("is it first page :"+p.isFirst());
		System.out.println("is it last page :"+p.isLast());
		System.out.println("page size :"+p.getSize());
		System.out.println("pagee Elements count :"+p.getNumberOfElements());
		if(!p.isEmpty()) {
			p.getContent().forEach(System.out::println);
			
		}else
			System.out.println("no page found");
		
	}
catch (Exception e) {
System.out.println(e.toString());
}
}
}
