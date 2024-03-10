package com.example.users.users.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.users.users.UserInfo;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void saveUser(UserInfo userInfo) {
		User user = new User();
		user.setAddress(userInfo.getAddress());
		user.setEmail(userInfo.getEmail());
		user.setName(userInfo.getName());
		user.setPhone(userInfo.getPhone());
		user.setCity(userInfo.getCity());
		user.setPassword(userInfo.getPassword());
		user.setUsername(userInfo.getUsername());
		user.setZipCode(userInfo.getZipCode());
		userRepository.save(user);
	}

	public UserInfo getUser(String phone) {
		// TODO Auto-generated method stub
		User user = userRepository.findByPhone(phone);
		UserInfo userInfo = new UserInfo();
		if (user != null) {
			userInfo.setAddress(user.getAddress());
			userInfo.setEmail(user.getEmail());
			userInfo.setName(user.getName());
			userInfo.setPhone(user.getPhone());
			userInfo.setCity(user.getCity());
			userInfo.setPassword(user.getPassword());
			userInfo.setUsername(user.getUsername());
			userInfo.setZipCode(user.getZipCode());

		}
		return userInfo;

	}
}