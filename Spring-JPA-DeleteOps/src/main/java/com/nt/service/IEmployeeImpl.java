package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class IEmployeeImpl implements IEmployeeService{
@Autowired 
	IEmployeeRepository repo;
	@Override
public void deleteAllById(List<Integer> l) {
	
	repo.deleteAllByIdInBatch(l);
}
}
