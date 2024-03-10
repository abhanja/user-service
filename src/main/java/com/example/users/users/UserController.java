package com.example.users.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.users.repo.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService userService;

	@PostMapping("/addUser")
	public String addUser(@RequestBody UserInfo userInfo) {
		userService.saveUser(userInfo);
		return userInfo.getUsername();
	}
	
	@PostMapping("/getUser")
	public UserInfo getUser(String phone) {
		return userService.getUser(phone);
	}
}
