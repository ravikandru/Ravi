package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbclasses.Orders;
import com.example.dbclasses.customers;
import com.example.repos.OrdersRepository;
import com.example.repos.customerRepository;

@RestController
public class mainController {
	
	@Autowired
	customerRepository custRe;
	
	@Autowired
	OrdersRepository ordersRe;

	@RequestMapping("/hi")
	public String hi(){
		return "Hi";
	}
	
	@RequestMapping("/customers")
	public List<customers> getAllCustomers(){
		return custRe.findAll();
		
	}
	
	@RequestMapping("/customers/{id}")
	public customers getOne(@PathVariable String id){
		return custRe.findOne(id);
	}
	
	@RequestMapping("/orders")
	public List<Orders> getAllOrders(){
		return ordersRe.findAll();
	}
	
	@RequestMapping("/orders/{id}")
	public Orders getOneOrder(@PathVariable String id){
		return ordersRe.findOne(id);
	}
	
	@RequestMapping("/customers/{custId}/orders")
	public List<Orders> getOrdersCustomer(@PathVariable String custId){
		List<Orders> orders = new ArrayList<>();
	  ordersRe.findByCustId(new ObjectId(custId))
	  .forEach(orders::add);
	  return orders;

	}
}
