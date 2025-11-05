package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserDetails;
import com.example.demo.repo.UserDetailsRepository;

@Service
public class UserDetailsService {
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	public void saveUser(UserDetails user) {
		userDetailsRepository.save(user);
	}
	
	public List<UserDetails> getAllUsers(){
		return userDetailsRepository.findAll();
	}
	
	public UserDetails getUser(Long primaryKey) {
		return userDetailsRepository.findById(primaryKey).get();
	}

}
