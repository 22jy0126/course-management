package com.hikariSchool.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.hikariSchool.model.Classes;

@Mapper
public interface ClassesMapper {
	ArrayList<Classes> get(Classes c);
	
	int updateById(Classes c);
	
	int saveNew(Classes c);
}


