package com.hikariSchool.service;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import com.hikariSchool.model.Teacher;
import com.hikariSchool.model.TeacherOfCourses;

@Transactional
public interface TeacherService {
	ArrayList<Teacher> getAll();
	
	ArrayList<TeacherOfCourses> getTeacherOfCourses();
}
