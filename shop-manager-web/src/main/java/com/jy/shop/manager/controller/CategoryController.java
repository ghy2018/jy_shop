package com.jy.shop.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jy.shop.manager.service.CategoryService;
import com.jy.shop.pojo.Category;

@Controller
@RequestMapping("/page")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	//http://localhost:9002/restful/page/category
	@GetMapping("/category")
	@ResponseBody
	public List<Category> searchList(){
		
		List<Category> list = null;
		try {
			list = categoryService.queryByCondition(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}
