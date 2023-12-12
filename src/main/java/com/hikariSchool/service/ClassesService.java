package com.hikariSchool.service;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.hikariSchool.model.Classes;

@Transactional
public interface ClassesService {
	ArrayList<Classes> get(Classes c);
	
	Integer updateById(Classes c);
	
	Integer saveNew(Classes c);
}
