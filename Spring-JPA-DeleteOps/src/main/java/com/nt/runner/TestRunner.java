package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeImpl;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	IEmployeeImpl serv;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		serv.deleteAllById(List.of(152,252));
	}

}
