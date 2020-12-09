package com.signuppage.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signuppage.modal.User;
import com.signuppage.repository.SignUpRepository;

@Service

public class SignUpDao {
	@Autowired
	SignUpRepository signuprepository;
	

	
	public User save(User user) {
		return signuprepository.save(user);
	}
	
	
	public Optional<User> findOne(Long id) {
		return signuprepository.findById(id);
	}
	

	
	
	

}
