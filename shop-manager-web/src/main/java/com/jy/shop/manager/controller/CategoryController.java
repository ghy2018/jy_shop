package com.jy.shop.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jy.shop.common.jedis.JedisClient;
import com.jy.shop.manager.service.CategoryService;
import com.jy.shop.pojo.Category;

@Controller
@RequestMapping("/page")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private JedisClient jedisClient;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	/**
	 * 商品类目的树型菜单展示
	 * @return
	 */
	//http://localhost:9002/restful/page/category
	@GetMapping("/category")
	@ResponseBody
	public List<Category> searchList(){
		
		List<Category> list = null;
		//查询缓存，有，返回数据
		try{
			String content = jedisClient.get("manager_category");
			if(null != content){
				JavaType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class, Category.class);		
				list = objectMapper.readValue(content, javaType);
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("写入缓存时出异常了");
		}
		
		//查询数据库
		try {
			list = categoryService.queryByCondition(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//如果缓存出现异常，会影响我们的正常业务吗?   答案是不能影响正常业务的，我们要手动捕捉异常
		//放入缓存
		try{
			String value = objectMapper.writeValueAsString(list);
			jedisClient.set("manager_category", value);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("写入缓存时出异常了");
		}
		
		return list;
	}
	
	
}
