package com.sacavix.service;

import com.sacavix.events.CustomerCreatedEvent;
import com.sacavix.events.Event;
import com.sacavix.events.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.sacavix.entity.Customer;

import java.util.Date;
import java.util.UUID;

@Component
public class CustomerEventsService {
	
	@Autowired
	private KafkaTemplate<String, Event<?>> producer;
	
	@Value("${topic.customer.name:customers}")
	private String topicCustomer;
	
	public void publish(Customer customer) {

		CustomerCreatedEvent created = new CustomerCreatedEvent();
		created.setData(customer);
		created.setId(UUID.randomUUID().toString());
		created.setType(EventType.CREATED);
		created.setDate(new Date());

		this.producer.send(topicCustomer, created);
	}
	
	

}
