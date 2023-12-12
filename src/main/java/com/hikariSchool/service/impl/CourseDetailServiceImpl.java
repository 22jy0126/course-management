package com.hikariSchool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hikariSchool.mapper.CourseDetailMapper;
import com.hikariSchool.model.CourseDetail;
import com.hikariSchool.service.CourseDetailService;

@Service
public class CourseDetailServiceImpl implements CourseDetailService {
	@Autowired
	CourseDetailMapper mapper;
	
	@Override
	public CourseDetail getById(Integer classId) {
		return mapper.getById(classId);
	}

}
