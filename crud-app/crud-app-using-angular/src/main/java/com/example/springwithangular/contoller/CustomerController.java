package com.example.springwithangular.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springwithangular.entity.Customer;
import com.example.springwithangular.service.CustomerService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class CustomerController {
	
	@Autowired
	private  CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer postCustomer(@RequestBody Customer customer) {
		return customerService.postCustomer(customer);
	}
	
	@GetMapping("/allCustomer")
	public List<Customer> getAllCustomer(){
		return this.customerService.getAllCustomer();
	}
	
}
