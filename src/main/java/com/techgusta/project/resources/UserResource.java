package com.techgusta.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techgusta.project.entities.User;

@RestController
@RequestMapping(path = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Jane Doe", "JaneDoe@Anonymous", "00000000", "999");
		return ResponseEntity.ok().body(user);
	}
}
