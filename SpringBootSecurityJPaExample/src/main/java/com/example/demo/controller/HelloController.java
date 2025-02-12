package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repository.UserInfoRepository;

@RestController
@RequestMapping(value = "/api")
public class HelloController {

	@Autowired
	private UserInfoRepository userRepo;

	@PostMapping(value = "/createUser")
	public User createUser(@RequestBody User user) {
		return userRepo.save(user);

	}

	@GetMapping(value = "/getUserInfo/{userId}")
	public Optional<User> getUserInfo(@PathVariable("userId") Integer userId) {
		return userRepo.findById(userId);

	}

	@GetMapping(value = "/getAllInfo")
	public Iterable<User> getAllInfo() {

		return userRepo.findAll();

	}

	@DeleteMapping(value = "/delete/{userId}")
	public void deleteInfo(@PathVariable("userId") Integer userId) {
		userRepo.deleteById(userId);

	}
	
	
	@PutMapping(value="/updateInfo/{userId}")
	public  ResponseEntity<User> updateinfo(@PathVariable("userId") Integer userId,@RequestBody User user) {
		 Optional<User> userData = userRepo.findById(userId);

		    if (userData.isPresent()) {
		      User user1 = userData.get();
		      user1.setEmail(user.getEmail());
		     
		      return new ResponseEntity<>(userRepo.save(user1), HttpStatus.OK);
		    } else {
		      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }
		
		
		
	}

}
