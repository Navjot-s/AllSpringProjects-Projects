package com.example.springwithangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springwithangular.entity.Customer;
import com.example.springwithangular.repository.CustomerRepository;



@Service

public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer postCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
}
