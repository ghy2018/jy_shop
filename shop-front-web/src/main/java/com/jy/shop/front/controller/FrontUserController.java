package com.jy.shop.front.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jy.shop.front.pojo.HttpResult;
import com.jy.shop.front.service.HttpClientService;
import com.jy.shop.pojo.User;

@Controller
@RequestMapping("/user")
public class FrontUserController {
	
	@Autowired
	private HttpClientService httpClientService;
	
	
	//springmvc 会自动忽略后缀名
	///user/login.html
	@GetMapping("/login")
	public String toLogin(){
		return "login";
	}
	
	@GetMapping("/reg")
	public String toReg(){
		return "reg";
	}
	
	//http://localhost:9003/user/doreg.html
	@PostMapping("/doreg")
	public ModelAndView register(User user){
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		String url = "http://localhost:9010/user/register";
		try {
			Map<String, String> params = new HashMap<>();
			params.put("userName", user.getUserName());
			params.put("pwd", user.getPwd());
			params.put("phone", user.getPhone());
			params.put("email", user.getEmail());
			HttpResult result = httpClientService.doPost(url, params);
			if(result.getCode() == 200){
				mv.setViewName("redirect:/user/login.html");
			}
		} catch (IOException e) {
			e.printStackTrace();
			mv.setViewName("redirect:/user/reg.html");
		}
		return mv;
	}
	
}
