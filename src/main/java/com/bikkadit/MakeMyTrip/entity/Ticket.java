package com.bikkadit.MakeMyTrip.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
	
    private int tId;
	
	private String pnr;
	
	private String tStatus;
	
	private Double tprice; 

}
