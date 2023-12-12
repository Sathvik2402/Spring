package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;
@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private IEmployeeService empserv;
	@Override
	public void run(String... args) throws Exception {
		try {
		Employee emp=new Employee();
		emp.setName("spike");
		emp.setRole("Browser");
		emp.setIncome(50000);
		String resultMsg=empserv.registerEmployee(emp);
		System.out.println(resultMsg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
