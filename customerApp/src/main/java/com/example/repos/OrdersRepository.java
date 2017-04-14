package com.example.repos;

import java.util.List;



import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.dbclasses.Orders;

public interface OrdersRepository extends MongoRepository<Orders, String> {

	List<Orders> findByCustId(ObjectId objectId);



	

}