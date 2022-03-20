package com.sacavix.service;

import org.springframework.stereotype.Service;

import com.sacavix.entity.Customer;

@Service
public class CustomerService {
	
	private final CustomerEventsService customerEventsService;

	public CustomerService(CustomerEventsService customerEventsService) {
		super();
		this.customerEventsService = customerEventsService;
	}

	public Customer save(Customer customer) {
		System.out.println("Received " + customer);
		this.customerEventsService.publish(customer);
		return customer;
		
	}

}
