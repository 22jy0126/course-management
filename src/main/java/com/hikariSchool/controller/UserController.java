package com.hikariSchool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikariSchool.model.User;
import com.hikariSchool.service.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/login")
	Result login(@RequestBody User user, HttpSession session) {
		User loginUser = service.login(user);
		if (loginUser == null) {
			return new Result(Code.LOGIN_ERROR, null, "ログイン失敗しました");
		}
		
		session.setAttribute("loginInfo", loginUser);
		
		return new Result(Code.LOGIN_OK, null, "ログイン成功しました");
	}
	
	@GetMapping("/login/info")
	Result islogin(HttpSession session) {
		User loginUser = (User) session.getAttribute("loginInfo");
		if (loginUser == null) {
			return new Result(Code.ISNOT_LOGIN, null);
		}
		return new Result(Code.IS_LOGIN, loginUser);
	}
	
}
