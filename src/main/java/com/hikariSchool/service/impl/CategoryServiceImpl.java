package com.hikariSchool.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hikariSchool.mapper.CategoryMapper;
import com.hikariSchool.model.Category;
import com.hikariSchool.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryMapper mapper;

	@Override
	public int saveNew(Category category) {
		int res = mapper.saveNew(category);
		return res;
	}

	@Override
	public ArrayList<Category> getAll() {
		return mapper.getAll(); 
	}
}
