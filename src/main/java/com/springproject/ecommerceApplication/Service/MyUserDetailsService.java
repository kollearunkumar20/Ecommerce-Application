package com.springproject.ecommerceApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.springproject.ecommerceApplication.UserPrincipal;
import com.springproject.ecommerceApplication.User;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserJpaRepository userJpaRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	User user= userJpaRepository.findByUsername(username);
	
	if (user==null) {
		System.out.println("User 404");
		throw new UsernameNotFoundException("User 404");
	}
		 return new UserPrincipal(user);
	}

}