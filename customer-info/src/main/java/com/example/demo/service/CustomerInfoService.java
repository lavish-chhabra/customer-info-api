package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CustomerInfo;
import com.example.demo.repository.CustomerInfoRepo;

@Service
public class CustomerInfoService {

	@Autowired
	private CustomerInfoRepo repo;
	
	public List<CustomerInfo> findAll() {
		return this.repo.findAll();
	}
	
	public CustomerInfo add(CustomerInfo customer) {
		return this.repo.save(customer);
	}
}
