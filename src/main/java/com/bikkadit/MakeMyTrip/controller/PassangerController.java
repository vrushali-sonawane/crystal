package com.bikkadit.MakeMyTrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.MakeMyTrip.entity.Passanger;
import com.bikkadit.MakeMyTrip.entity.Ticket;
import com.bikkadit.MakeMyTrip.exception.ResourceNotFoundException;
import com.bikkadit.MakeMyTrip.service.PassangerServiceI;

@RestController
public class PassangerController {
	
	@Autowired
	private PassangerServiceI passangerServiceI;
	
	
	@PostMapping(value="/bookTicket", consumes="application/json", produces="application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger passanger){
		
		Ticket ticket = passangerServiceI.bookTicket(passanger);
		
		if(passanger !=null) {
			return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
		}
		return new ResponseEntity<Ticket> (HttpStatus.BAD_REQUEST);
		
	}

}
