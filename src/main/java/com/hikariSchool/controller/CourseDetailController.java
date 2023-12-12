package com.hikariSchool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikariSchool.model.CourseDetail;
import com.hikariSchool.service.CourseDetailService;

@RestController
@RequestMapping("/course/courseDetail")
public class CourseDetailController {
	@Autowired
	CourseDetailService service;
	
	@GetMapping("/{classId}")
	Result getById(@PathVariable Integer classId) {
		CourseDetail res = service.getById(classId);
		Integer code = res != null ? Code.GET_OK : Code.GET_ERROR;
		String msg = res != null ? "OK" : "データクリアに失敗しました、もう一度お試してください";
		return new Result(code, res, msg);
	}
}
