package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class Ms5FallBackMethodMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms5FallBackMethodMsApplication.class, args);
	}

}
