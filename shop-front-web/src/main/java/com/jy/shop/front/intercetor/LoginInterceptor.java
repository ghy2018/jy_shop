package com.jy.shop.front.intercetor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.jy.shop.front.service.HttpClientService;
import com.jy.shop.front.util.CookieUtils;

public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	private HttpClientService httpClientService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String ticket = CookieUtils.getCookieValue(request, "ticket");
		
		if(null != ticket) {
			//根据 ticket 查询用户信息
			//http://localhost:9010/user/{ticket}
			String url = "http://localhost:9010/user/" + ticket;
			String result = httpClientService.doGet(url);
			
			if(null != result) {
				//若已登录，则放行
				return true;
			}
		}
		
		response.sendRedirect("/user/login.html");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
