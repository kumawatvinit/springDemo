package com.example.spring.model;

import java.util.List;
import java.util.ArrayList;

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
	
	public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getId() {
        return id;
    }
}

@RestController
public class UserList {
	@GetMapping("/users")
	
	public List<user> fn()
	{
		List<user> users = new ArrayList<>();
		
		users.add(new user(1, "ela", "SDE"));
		users.add(new user(2, "regu", "ASD"));
		users.add(new user(3, "jinsa", "GM"));
		users.add(new user(4, "eqape", "INS"));
		users.add(new user(5, "pujiw", "CO"));
		
		return users;
	}
}
