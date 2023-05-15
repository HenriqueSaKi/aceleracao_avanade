package com.springbootexample.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootexample.models.Book;

public interface BookRepository extends MongoRepository<Book, String> {
    
}
