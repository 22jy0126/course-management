package com.hikariSchool.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.hikariSchool.model.Category;

@Mapper
public interface CategoryMapper {
	int saveNew(Category category);
	
	ArrayList<Category> getAll();
}
