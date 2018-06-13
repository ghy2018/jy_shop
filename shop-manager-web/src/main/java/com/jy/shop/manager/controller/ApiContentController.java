package com.jy.shop.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jy.shop.manager.service.ContentService;
import com.jy.shop.pojo.Content;

@Controller
public class ApiContentController {

	@Autowired
	private ContentService contentService;
	
	/**
	 * 后台系统表现层实现大小广告的查询
	 * @return
	 */
	@GetMapping("/apiContent/{id}")
	@ResponseBody
	public List<Content> toIndex(@PathVariable("id") Long id){
		//把传入的id设置为 content 的类目id
		Content content = new Content();
		content.setCategoryId(id);
		
		List<Content> list;
		try {
			list = contentService.queryByCondition(content);
			System.out.println(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
