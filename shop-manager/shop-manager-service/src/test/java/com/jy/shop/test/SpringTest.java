package com.jy.shop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jy.shop.manager.dao.UserMapper;
import com.jy.shop.manager.service.CategoryService;
import com.jy.shop.manager.service.UserService;
import com.jy.shop.pojo.Category;
import com.jy.shop.pojo.User;

public class SpringTest {
/*
	@Test
	public void testDao(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
		UserMapper um = (UserMapper) ac.getBean("userMapper");
		User user = new User();
		user.setUserName("CC");
		user.setPwd("123");
		user.setPhone("13456789012");
		user.setEmail("cc@163.com");
		um.insert(user);
	}
	
	@Test
	public void testService(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");
		UserService us = (UserService) ac.getBean("userServiceImpl");
		boolean flag = us.deleteById(10L);
		System.out.println(flag);
	}
	*/
}