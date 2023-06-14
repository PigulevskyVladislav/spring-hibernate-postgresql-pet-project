package com.pigulevsky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class GreetingsController {
	
	@GetMapping
	public String sayHello() {
		return "Hello world";
	}
}