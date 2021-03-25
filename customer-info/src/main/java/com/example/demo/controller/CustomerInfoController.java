package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.CustomerInfo;
import com.example.demo.service.CustomerInfoService;

@RestController
@RequestMapping(path="/rest-api")
public class CustomerInfoController {

	@Autowired
	private CustomerInfoService service;
	
	@GetMapping(path="/customers")
	public List<CustomerInfo> getAllCustomers() {
		return this.service.findAll();
	}
	
	@PostMapping(path="/customers", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerInfo addCustomer(@RequestBody CustomerInfo customer) {
		return this.service.add(customer);
	}
	
}
