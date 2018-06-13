package com.jy.shop.sso.service.impl;

import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jy.shop.common.jedis.JedisClient;
import com.jy.shop.manager.dao.UserMapper;
import com.jy.shop.pojo.User;
import com.jy.shop.sso.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private JedisClient jedisClient;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	/**
	 * 校验数据
	 */
	@Override
	public Boolean checkDataByCondition(String param, Integer type) {
		User user = new User();
		if(type == 1){
			user.setUserName(param);
		} else if(type == 2){
			user.setPhone(param);
		} else if(type == 3){
			user.setEmail(param);
		}
		return userMapper.selectCount(user) > 0 ? true : false;
	}

	
	/**
	 * 注册
	 */
	@Override
	public Boolean save(User user) {
		
		String pwd = user.getPwd();
		
		System.out.println("pwd : " + pwd);
		//把原先的密码进行md5加密 存入数据库
		String md5Pwd = DigestUtils.md5Hex(pwd);
		System.out.println("加密过的密码: " + md5Pwd);
		
		user.setPwd(md5Pwd);
		return userMapper.insertSelective(user) > 0 ? true : false;
	}


	/**
	 * 登录
	 * 	成功把 登录的用户信息放入 redis
	 * 	返回 ticket
	 * @throws Exception 
	 */
	@Override
	public String queryUserByUserName(String username, String password) throws Exception {
		String ticket = null;
		
		User user = new User();
		user.setUserName(username);
		User u = userMapper.selectOne(user);
		
		if(null != u){
			//数据库获取出来的密码(加密过的密码)
			String pwd = u.getPwd();
			if(pwd.equals(DigestUtils.md5Hex(password.trim()))){
				//用户名密码都匹配，登录成功
				ticket = DigestUtils.md5Hex(user.getUserName());
				//把 对象 放入 redis 缓存
				jedisClient.set("ticket", objectMapper.writeValueAsString(u));
				//设置 缓存有效期为 1800秒
				jedisClient.expire("ticket", 1800);
			}
		}
		return ticket;
	}


	/**
	 * 根据 tikect 查询 用户
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	@Override
	public User queryUserByTicket(String ticket) throws Exception {
		
		String userStr = jedisClient.get(ticket);
		
		if(null != userStr){
			User user = objectMapper.readValue(userStr, User.class);
			return user;
		}
		return null;
	}
	
}
