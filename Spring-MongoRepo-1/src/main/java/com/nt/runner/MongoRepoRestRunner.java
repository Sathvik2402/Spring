package com.nt.runner;

import java.time.LocalDateTime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeService;
@Component
public class MongoRepoRestRunner implements CommandLineRunner {
	@Autowired
	IEmployeeService serve;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		System.out.println(serve.saveEmployee(
//				new Employee(
//						"eagle",
//						"hyd",
//						70000.0f,
//						true,
//						LocalDateTime.now()
//						)
////				));
//		List<Employee> el=List.of(
//				new Employee(
//						"harry",
//						"la",
//						70000.0f,
//						true,
//						LocalDateTime.now()
//						),new Employee(
//								"ron",
//								"ny",
//								40000.0f,
//								false,
//								LocalDateTime.now()
//								)
//				);
//		serve.saveEmployeesInBatch(el);
////	
		serve.getEmployeesInBatch().forEach(System.out::println);
		
		}

}
