package com.nt.ms;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/Booking")
public class TicketBookingOpsController {

//	@GetMapping("/Book")
//	@HystrixCommand(fallbackMethod = "sampleBook", commandProperties = {@HystrixProperty(name = "circuitBreaker.enabled",value="true")})
	
	
	
	@GetMapping("/Book")
	@HystrixCommand(fallbackMethod = "sampleBook", commandProperties = {@HystrixProperty(name = "circuitBreaker.enabled",value="true"),
																		@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="5"),		
																		@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value="10000")})
	public ResponseEntity<String> bookTicketString() {
		if(new Random().nextInt(10)<8)
		throw new RuntimeException("Problem in the b.logic");
		else {
			System.out.println("TicketBookingOpsController.bookTicket()");
		return new ResponseEntity<String>("Booking success",HttpStatus.OK);
	}}
	
	int count =1 ;
	public ResponseEntity<String> sampleBook(){
		System.out.println("TicketBookingOpsController.sampleBook():"+count++);
	
		return new ResponseEntity<String>("Problem in Bookin",HttpStatus.OK);
	}
}
