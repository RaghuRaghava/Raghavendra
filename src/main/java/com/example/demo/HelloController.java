package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value="/add")
	int add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
}
