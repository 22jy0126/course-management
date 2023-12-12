package com.hikariSchool.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hikariSchool.model.CourseDetail;

@Mapper
public interface CourseDetailMapper {
	CourseDetail getById(Integer classId);
}
