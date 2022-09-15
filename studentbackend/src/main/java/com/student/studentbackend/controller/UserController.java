package com.student.studentbackend.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentbackend.exception.ResourceNotFoundException;
import com.student.studentbackend.model.User;
import com.student.studentbackend.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/home")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	// get all users
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	// create user rest api
	@PostMapping("/users")
	public User createUsers(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	// get employee by id rest api
	@GetMapping("/users/{rollno}")
	public ResponseEntity<User> getUserById(@PathVariable int rollno) {
		User employee = userRepository.findById(rollno).orElseThrow(() -> new ResourceNotFoundException("User does not exist with id :" + rollno));
		return ResponseEntity.ok(employee);
	}

}
