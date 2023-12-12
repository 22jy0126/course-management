package com.hikariSchool.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikariSchool.model.Teacher;
import com.hikariSchool.model.TeacherOfCourses;
import com.hikariSchool.service.TeacherService;

@RestController
@RequestMapping("/course/teacher")
public class TeacherController {
	@Autowired
	TeacherService service;
	
	@GetMapping("/getAll")
	Result getAll() {
		ArrayList<Teacher> data = service.getAll();
		Integer code = data != null ? Code.GET_OK : Code.GET_ERROR;
		String msg = data != null ? "OK" : "データクリアに失敗しました、もう一度お試してください";
		return new Result(code, data, msg);
	} 
	
	@GetMapping("/getCourses")
	Result getTeacherAllCourses() {
		ArrayList<TeacherOfCourses> data = service.getTeacherOfCourses();
		Integer code = data != null ? Code.GET_OK : Code.GET_ERROR;
		String msg = data != null ? "OK" : "データクリアに失敗しました、もう一度お試してください";
		return new Result(code, data, msg);
	}
}
