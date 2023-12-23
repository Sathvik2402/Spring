package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.nt.document.Employee;

public interface IEmployeeRepository extends MongoRepository<Employee, String>,CrudRepository<Employee, String> {

}
