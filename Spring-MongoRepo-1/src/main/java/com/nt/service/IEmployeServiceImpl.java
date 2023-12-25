package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepository;
@Service
public class IEmployeServiceImpl implements IEmployeeService {
@Autowired
	IEmployeeRepository repo;
	@Override
public String saveEmployee(Employee doc) {
	// TODO Auto-generated method stub
		String idVal=repo.save(doc).getId();
	return "Employee Document with id"+idVal+"saved";
	}
	@Override
		public List<Employee> saveEmployeesInBatch(List<Employee> e) {
		List<Employee> l=repo.saveAll(e);
			return l;
		}
	@Override
	public List<Employee> getEmployeesInBatch() {
		List<Employee> li=repo.findAll();
		return li;
	}
}
