package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmplRepository;

@Service("employeeService")
public class EmployeeMgmtService implements IEmployeeService{

	@Autowired
	private IEmplRepository empRepo;
	@Override
	public String registerEmployee(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("emp id before save: "+emp.getId());
		Employee em=empRepo.save(emp);
		return "emp obj saved with id value: "+em.getId();
	}
}