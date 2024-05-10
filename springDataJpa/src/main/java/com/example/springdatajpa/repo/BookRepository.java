package com.example.springdatajpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.springdatajpa.model.BookModel;

public interface BookRepository extends CrudRepository<BookModel, Integer>{
 
}
