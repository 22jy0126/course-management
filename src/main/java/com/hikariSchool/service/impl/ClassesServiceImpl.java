package com.hikariSchool.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hikariSchool.mapper.ClassesMapper;
import com.hikariSchool.model.Classes;
import com.hikariSchool.service.ClassesService;

@Service
public class ClassesServiceImpl implements ClassesService {
	
	@Autowired
	ClassesMapper mapper;

	@Override
	public ArrayList<Classes> get(Classes c) {
		return mapper.get(c);
	}

	@Override
	public Integer updateById(Classes c) {
		return mapper.updateById(c);
	}

	@Override
	public Integer saveNew(Classes c) {
		return mapper.saveNew(c);
	}

}
