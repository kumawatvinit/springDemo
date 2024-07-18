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
		
		users[0] = new user(1, "ela", "SDE");
		users[1] = new user(2, "regu", "ASD");
		users[2] = new user(3, "jinsa", "GM");
		users[3] = new user(4, "eqape", "INS");
		users[4] = new user(5, "pujiw", "CO");
		
		return "Working";
	}
}
