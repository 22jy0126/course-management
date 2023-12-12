package com.hikariSchool.service;

import org.springframework.transaction.annotation.Transactional;

import com.hikariSchool.model.User;

@Transactional
public interface UserService {
	User login(User user);
}



