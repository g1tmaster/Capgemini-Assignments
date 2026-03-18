package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot";
    }
	
	@GetMapping("/hello/{n}")
	public String sayHello(@PathVariable("n") String name ) {
		return "Hello Hello " + name;
	}
}
