package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface IEmployeeService {
public String saveEmployee(Employee doc);
public List<Employee> saveEmployeesInBatch(List<Employee> e);
public List<Employee> getEmployeesInBatch();
}
