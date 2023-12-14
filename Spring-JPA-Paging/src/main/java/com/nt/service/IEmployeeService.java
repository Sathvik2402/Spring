package com.nt.service;




import org.springframework.data.domain.Page;

import com.nt.entity.Employee;

public interface IEmployeeService {
public Page<Employee> getEmployeeRecordsByPages(int pageSize,int pageNo,boolean ascOrder,String props);

}
