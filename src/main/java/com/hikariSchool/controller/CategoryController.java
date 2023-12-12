package com.hikariSchool.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikariSchool.model.Category;
import com.hikariSchool.service.CategoryService;

@RestController
@RequestMapping("/course/category")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@PostMapping
	public int save(Category category) {
		int res = service.saveNew(category);
		return res;
	}
	
	@GetMapping
	public Result get() {
		ArrayList<Category> CategoryArray = service.getAll();
		if (CategoryArray.size() > 0) {
			return new Result(Code.GET_OK, CategoryArray);
		} else {
			return new Result(Code.GET_ERROR, "カテゴリーがゲットできませんでした");
		}
	}
}
