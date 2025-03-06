package com.springproject.ecommerceApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springproject.ecommerceApplication.User;
import com.springproject.ecommerceApplication.UserJpaRepository;



@Service
public class UserService {
	
@Autowired
	private UserJpaRepository userJpaRepository;
private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println(user.getPassword());
	return userJpaRepository.save(user) ;
		
	}
}