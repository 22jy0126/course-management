package com.hikariSchool.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hikariSchool.model.User;

@Mapper
public interface UserMapper {
	User findUser(User user);
}
