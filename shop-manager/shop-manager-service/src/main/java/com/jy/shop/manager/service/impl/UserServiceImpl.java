package com.jy.shop.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.shop.manager.dao.UserMapper;
import com.jy.shop.manager.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean deleteById(Long id) {
		return userMapper.deleteByPrimaryKey(id) > 0 ? true : false;
	}

}
