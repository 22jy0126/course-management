package com.hikariSchool.service;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.hikariSchool.model.Category;

@Transactional
public interface CategoryService {
	int saveNew(Category category);
	
	ArrayList<Category> getAll();
}
