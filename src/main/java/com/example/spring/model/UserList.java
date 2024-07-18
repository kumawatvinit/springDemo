package com.example.spring.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


class user {
	String name;
	String designation;
	int id;
	
	user(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
}

@RestController
public class UserList {
	@GetMapping("/users")
	
	public String fn()
	{
		user[] users = new user[5];
		
		
		
		return "Working";
	}
}
