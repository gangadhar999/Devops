package com.Javashree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "Hello Devops";
	}

}
