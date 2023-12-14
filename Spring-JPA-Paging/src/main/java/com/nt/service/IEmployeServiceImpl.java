package com.nt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepo;
@Service
public class IEmployeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeRepo repo;
	@Override
public Page<Employee> getEmployeeRecordsByPages(int pageSize, int pageNo, boolean ascOrder, String props) {
	Pageable p=PageRequest.of(pageNo, pageSize);
	return repo.findAll(p);
}
}
