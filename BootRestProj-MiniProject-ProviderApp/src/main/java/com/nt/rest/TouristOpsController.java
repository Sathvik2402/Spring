package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nt.entity.Tourist;
import com.nt.service.ITouristMgmtService;

@RestController()
@RequestMapping("/ride")
public class TouristOpsController {

	@Autowired 
	private ITouristMgmtService service;
	
	@PostMapping("/register")
	public ResponseEntity<?>  registerTourist(@RequestBody Tourist tourist){
		
		try {
		return new ResponseEntity<String>(service.registerTourist(tourist),HttpStatus.OK);
		}
		catch(Exception e) {
		return new ResponseEntity<Exception>(e,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/Tourists")
	public ResponseEntity<?> displayTourists( ){	
		try {
		return new ResponseEntity<List<Tourist>>(service.showAllTourist(),HttpStatus.OK); }
		catch (Exception e) {
			return new ResponseEntity<Exception>(e,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{city1}/{city2}/{city3}")
	public ResponseEntity<?> gegTempInCitysample(@PathVariable(required = false) String city1,@PathVariable(required=false) String city2,@PathVariable( required = false) String city3){
		try {
		return new ResponseEntity<List<Tourist>>(service.findByCity(city1, city2, city3),HttpStatus.OK); 
	}
		catch (Exception e) {
		return new ResponseEntity<Exception>(e,HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}
}


