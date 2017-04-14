package com.example.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.dbclasses.customers;

public interface customerRepository extends MongoRepository<customers, String> {

}
