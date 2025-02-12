package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.exception.UserExistsException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserInfoRepository;

@RestController
@RequestMapping(value = "/api")
public class HelloController {

	@Autowired
	private UserInfoRepository userRepo;

	@PostMapping(value = "/createUser")
	@ResponseBody
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) throws UserExistsException {

		Iterable<User> name = userRepo.findAll();
		for (User user2 : name) {

			if ((user2.getName().equals(user.getName()) && user2.getEmail().equals(user.getEmail()))) {
				throw new UserExistsException("username and email is already available");
			
		}
		}
		userRepo.save(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@GetMapping(value = "/getUserInfo/{userId}")
	public Optional<User> getUserInfo(@PathVariable("userId") Integer userId) throws UserNotFoundException {
		Optional<User> user = userRepo.findById(userId);
		if (!user.isPresent()) {
			throw new UserNotFoundException("User not Found  for " + userId);
		}
		return user;

	}

	@GetMapping(value = "/getAllInfo")
	public Iterable<User> getAllInfo() {

		return userRepo.findAll();

	}

	@DeleteMapping(value = "/delete/{userId}")
	public void deleteInfo(@PathVariable("userId") Integer userId) throws UserNotFoundException {

		Optional<User> userid = userRepo.findById(userId);

		if (!userid.isPresent()) {
			throw new UserNotFoundException("User ID is not found in DB");

		} else {
			userRepo.deleteById(userId);
		}
	}

	@PutMapping(value = "/updateInfo/{userId}")
	public ResponseEntity<User> updateinfo(@PathVariable("userId") Integer userId, @RequestBody User user) {
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
