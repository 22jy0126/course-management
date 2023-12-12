package com.hikariSchool.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;

import com.google.gson.Gson;
import com.hikariSchool.controller.Code;
import com.hikariSchool.controller.Result;
import com.hikariSchool.model.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
	@Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
		User user = (User)httpServletRequest.getSession().getAttribute("loginInfo");
		if (user == null) {
			httpServletResponse.setCharacterEncoding("UTF-8");
			httpServletResponse.setContentType("application/json");
			httpServletResponse.getWriter().append(new Gson().toJson(new Result(Code.LOGIN_ERROR, null, "ログインしてください")));
			return false;
		}
        return true;
    }
}
