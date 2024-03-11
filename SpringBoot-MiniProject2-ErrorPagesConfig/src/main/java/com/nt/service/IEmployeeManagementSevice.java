package com.nt.service;

import java.util.List;

import com.nt.model.Emp;

public interface IEmployeeManagementSevice {
public List<Emp> fetchAllEmployees();
public Emp register(Emp e);
public Emp findEmpById(int no);
public String modifyEmp(Emp e);
public String deleteEmployee(int no);
}
