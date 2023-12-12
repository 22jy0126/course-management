package com.hikariSchool.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikariSchool.model.Classes;
import com.hikariSchool.service.ClassesService;

@RestController
@RequestMapping("/course/classes")
public class ClassesController {
	@Autowired
	ClassesService service;
	
	@PostMapping("/get")
	Result get(@RequestBody Classes c) {
		ArrayList<Classes> res = service.get(c);
		Integer code = res != null ? Code.GET_OK : Code.GET_ERROR;
		String msg = res != null ? "OK" : "データクリアに失敗しました、もう一度お試してください";
		return new Result(code, res, msg);
	}
	
	@PostMapping("/update")
	Result updateById(@RequestBody Classes c) {
		Integer res = service.updateById(c);
		Integer code = res == 1 ? Code.UPDATE_OK : Code.UPDATE_ERROR;
		String msg = res == 1 ? "OK" : "只今、更新できません、少し後でもう一度お試してください";
		return new Result(code, res, msg);
	}
	
	@PostMapping("/save")
	Result saveNew(@RequestBody Classes c) {
		Integer res = service.saveNew(c);
		Integer code = res == 1 ? Code.SAVE_OK : Code.SAVE_ERROR;
		String msg = res == 1 ? "OK" : "只今、保存できません、少し後でもう一度お試してください";
		return new Result(code, res, msg);
	}
}
