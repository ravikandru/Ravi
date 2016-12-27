package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class Controller1 {
	
	@RequestMapping(value="/{name}",produces = "text/plain")
	public String hello(@PathVariable("name") String name) {
		return "Hello " + name;
	}

}

