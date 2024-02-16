package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.model.Emp;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeMgmtServiceImpl  implements IEmployeeManagementSevice{

	@Autowired
	private IEmployeeRepository repo;
	
	
	@Override
	public List<Emp> fetchAllEmployees() {
	return repo.findAll();
	
	}
	@Override
	public Emp register(Emp e) {
		return repo.save(e);
	}
	@Override
	public Emp findEmpById(int no) {
		return repo.findById(no).orElseThrow(()->new IllegalArgumentException("Employee Not Found"));
	}
	
	@Override
	public String modifyEmp(Emp e) {
		Optional<Emp> o=repo.findById(e.getEmpno());
		if(o.isPresent())
				repo.save(e);
		return "Employee with emp id:"+e.getEmpno()+" is updated";
	}
	@Override
	public String deleteEmployee(int no) {
		Optional<Emp> o=repo.findById(no);
		if(o.isPresent()) {
			repo.deleteById(no);
			return no+"is deleted";}
		else
			return "Employee Not Found";
	}
	@Override
	public Page<Emp> fechEmplByPageNo(Pageable pageable) {
		Page<Emp> page=repo.findAll(pageable);
		return page;
	}
}
