package com.jy.shop.front.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jy.shop.front.service.HttpClientService;
import com.jy.shop.pojo.Content;

@Controller
public class IndexController {

	@Autowired
	private HttpClientService httpClientService;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	/**
	 * 首页显示
	 * 	展示 大广告位，小广告位
	 * @return
	 */
	@GetMapping("/index.html")
	public ModelAndView toIndex(){
		
		ModelAndView mv = new ModelAndView("index");
		
		// 使用 httpclient 实现大广告位的展示（前后端解耦）
		///http://localhost:9002/restful/apiContent/21
		String bigUrl = "http://localhost:9002/restful/apiContent/21";
		try {
			String bigContent = httpClientService.doGet(bigUrl);
			System.out.println(bigContent);
			JavaType javaType = objectMapper.getTypeFactory().
					constructCollectionType(List.class, Content.class);
			List<Content> bigADList = objectMapper.readValue(bigContent, javaType);
			mv.addObject("bigADList", bigADList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 使用 httpclient 实现小广告位的展示（前后端解耦）
		String smallUrl = "http://localhost:9002/restful/apiContent/24";
		try {
			String smallContent = httpClientService.doGet(smallUrl);
			JavaType javaType = objectMapper.getTypeFactory().
					constructCollectionType(List.class, Content.class);
			List<Content> smallADList = objectMapper.readValue(smallContent, javaType);
			mv.addObject("smallADList", smallADList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return mv;
	}
	
}
