package com.example.springwithangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springwithangular.entity.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}
