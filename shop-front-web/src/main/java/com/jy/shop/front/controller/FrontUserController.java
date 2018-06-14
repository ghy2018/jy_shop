package com.jy.shop.front.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jy.shop.front.pojo.HttpResult;
import com.jy.shop.front.service.HttpClientService;
import com.jy.shop.front.util.CookieUtils;
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
	
	/**
	 * 注册
	 * @param user
	 * @return
	 */
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
	
	/**
	 * 登录
	 */
	//http://localhost:9003/user/dologin.html
	//loginname: aa
	//nloginpwd: 123
	@PostMapping("/dologin")
	public ModelAndView login(String loginname, String nloginpwd,
			HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		
		String url = "http://localhost:9010/user/login";
		
		Map<String, String> params = new HashMap<>();
		params.put("userName", loginname);
		params.put("pwd", nloginpwd);
		try {
			HttpResult result = httpClientService.doPost(url, params);
			if(result.getCode() == 200){
				mv.setViewName("redirect:/index.html");
				String body = result.getBody();
				//登录成功，把登录的信息存入 cookie
				CookieUtils.setCookie(request, response, "ticket", body, 1800);
			}
		} catch (IOException e) {
			e.printStackTrace();
			mv.setViewName("redirect:error");
		}
		return mv;
	}
	
}
