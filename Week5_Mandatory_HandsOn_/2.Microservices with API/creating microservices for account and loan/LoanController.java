package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.entity.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@GetMapping("/{number}")
	public Loan getLoanDetails(@PathVariable String number) {
		return new Loan(number,"car",200000,3256,18);
	}	
}
