package com.cognizant.loan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoanController {

	@GetMapping("/loan/{number}")
	public loan getloan(@PathVariable String number)
	
	{

		//{ number: "H00987987972342", type: "car", loan: 400000, emi: 3258, tenure: 18 }
		
		loan ln=new loan("H00987987972342","car",54545241,325478,18);
	
		return ln;
	
		//else return null;
	}
	
	
}
