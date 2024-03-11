package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Emp;

public interface IEmployeeRepository extends JpaRepository<Emp, Integer>{

}
