package com.jy.shop.sso.service;

import com.jy.shop.pojo.User;

public interface UserService {

	Boolean checkDataByCondition(String param, Integer type);

	Boolean save(User user);

	String queryUserByUserName(String username, String password) throws Exception;

	User queryUserByTicket(String ticket) throws Exception;

}
