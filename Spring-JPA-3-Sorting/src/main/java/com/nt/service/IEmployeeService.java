package com.nt.service;

import com.nt.entity.Employee;

public interface IEmployeeService {
public Iterable<Employee> sortEmployee(String props,Boolean dir);
}
