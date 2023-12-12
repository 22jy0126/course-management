package com.hikariSchool.service;

import org.springframework.transaction.annotation.Transactional;

import com.hikariSchool.model.CourseDetail;

@Transactional
public interface CourseDetailService {
	CourseDetail getById(Integer classId);
}
