package com.hikariSchool.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hikariSchool.mapper.TeacherMapper;
import com.hikariSchool.model.Classes;
import com.hikariSchool.model.Teacher;
import com.hikariSchool.model.TeacherClasses;
import com.hikariSchool.model.TeacherOfCourses;
import com.hikariSchool.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherMapper mapper;

	@Override
	public ArrayList<Teacher> getAll() {
		return mapper.getAll();
	}

	@Override
	public ArrayList<TeacherOfCourses> getTeacherOfCourses() {
		ArrayList<TeacherClasses> list = mapper.getTeacherClasses();
		ArrayList<TeacherOfCourses> resList = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			
			TeacherClasses tc = list.get(i);
			Integer teacherId = tc.getTeacherId();
			
			boolean find = false;
			for (int j = 0; j < resList.size(); j++) {
				TeacherOfCourses toc = resList.get(j);
				Integer tid = toc.getTeacherId();
				if (tid == teacherId) {
					find = true;
					
					Classes c = new Classes();
					c.setClassId(tc.getClassId());
					c.setClassName(tc.getClassName());
					
					ArrayList<Classes> courses = toc.getCourses();
					courses.add(c);
					break;
				}
			}
			
			if (!find) {
				TeacherOfCourses toc = new TeacherOfCourses();
				toc.setTeacherId(teacherId);
				toc.setTeacherName(tc.getTeacherName());
				
				ArrayList<Classes> courses = new ArrayList<>();
				Classes c = new Classes();
				c.setClassId(tc.getClassId());
				c.setClassName(tc.getClassName());
				courses.add(c);
				toc.setCourses(courses);
				resList.add(toc);
			}
		}
		
		return resList;
	}

}
