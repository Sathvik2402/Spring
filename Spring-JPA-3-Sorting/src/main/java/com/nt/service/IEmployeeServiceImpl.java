package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;
@Service
public class IEmployeeServiceImpl implements IEmployeeService{
@Autowired
	IEmployeeRepository repo;
	@Override
public Iterable<Employee> sortEmployee(String props, Boolean dir) {
	Sort sort= Sort.by(dir?Direction.ASC:Direction.DESC,props);
		Iterable<Employee> it=repo.findAll(sort);
	return it;

	}
}
