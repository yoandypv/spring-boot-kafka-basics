package com.sacavix.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacavix.entity.Customer;
import com.sacavix.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping
	public Customer save(@RequestBody Customer customer) {
		return this.customerService.save(customer);
	}
	

}
