package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTest {
	@RequestMapping(value = "/test")
	String test() {
		

		return "JI";
	}
	@RequestMapping(value="/add/{a}/{b}")
	int add(@PathVariable int a,@PathVariable int b) {
		
	          int c=a+b;
	        		  
		       
	
				return c;
		
}
}
