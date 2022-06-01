package com.Ranim.demo.Security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Ranim.demo.entities.User;
import com.Ranim.demo.repos.UserRepository;
@Service
public class MyUserDetailsService  implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws
	UsernameNotFoundException {
	User user = userRepository.findByUsername(username);
	return new MyUserDetails(user);
	 }



}
