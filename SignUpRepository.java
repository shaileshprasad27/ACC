package com.signuppage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.signuppage.modal.User;


public interface SignUpRepository extends JpaRepository<User,Long> {
	

}
