package com.hikariSchool.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.hikariSchool.model.Teacher;
import com.hikariSchool.model.TeacherClasses;

@Mapper
public interface TeacherMapper {
	ArrayList<Teacher> getAll();
	
	ArrayList<TeacherClasses> getTeacherClasses();
}
