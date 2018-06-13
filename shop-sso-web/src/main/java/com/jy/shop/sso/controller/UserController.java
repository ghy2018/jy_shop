package com.jy.shop.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jy.shop.pojo.User;
import com.jy.shop.sso.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	//http://localhost:9010/user/check/{param}/{type}
	@Autowired
	private UserService userService;
	
	
	/**
	 * 校验数据是否合法
	 * 	true : 已存在，不可用
	 * 	false : 代表可用
	 * 
	 * @param param
	 * @param type
	 * @return
	 */
	@GetMapping("check/{param}/{type}")
	@ResponseBody
	public ResponseEntity<Boolean> checkData(@PathVariable("param") String param,
			@PathVariable("type") Integer type) {
		
		try {
			Boolean flag = userService.checkDataByCondition(param,type);
			return new ResponseEntity<>(flag,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//http://localhost:9010/user/register
	@PostMapping("/register")
	@ResponseBody
	public ResponseEntity<Boolean> register(User user){
		
		System.out.println("userController : " + user);
		try {
			Boolean flag = userService.save(user);
			System.out.println(flag);
			return new ResponseEntity<>(flag,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	//http://localhost:9010/user/login
	@PostMapping("/login")
	@ResponseBody
	public ResponseEntity<String> login(String username, String password){
		String ticket = null;
		try {
			ticket = userService.queryUserByUserName(username, password);
			return new ResponseEntity<>(ticket,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(ticket,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	//http://localhost:9010/user/{ticket}
	@GetMapping("/{ticket}")
	@ResponseBody
	public ResponseEntity<User> searchUserByTicket(@PathVariable("ticket") String ticket){
		User user = null;
		
		try {
			user = userService.queryUserByTicket(ticket);
			return new ResponseEntity<>(user,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(user,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
