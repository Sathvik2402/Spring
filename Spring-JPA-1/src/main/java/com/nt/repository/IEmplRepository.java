package com.nt.repository;

//import org.springframework.context.annotation.Profile;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Employee;

public interface IEmplRepository extends CrudRepository<Employee, Integer> {
	

}
