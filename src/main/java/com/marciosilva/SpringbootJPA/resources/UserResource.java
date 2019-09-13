package com.marciosilva.SpringbootJPA.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marciosilva.SpringbootJPA.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1l, "Marcio", "marcio@gmail.com", "997067777", "12345678");
		return ResponseEntity.ok().body(user);
	}
}
