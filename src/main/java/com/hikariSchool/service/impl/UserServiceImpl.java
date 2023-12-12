package com.hikariSchool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hikariSchool.mapper.UserMapper;
import com.hikariSchool.model.User;
import com.hikariSchool.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper mapper;

	@Override
	public User login(User user) {
		User finedUser = mapper.findUser(user);
		return finedUser;
	}

}
