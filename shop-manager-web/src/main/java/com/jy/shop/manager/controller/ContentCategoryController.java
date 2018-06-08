package com.jy.shop.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jy.shop.manager.service.ContentCategoryService;
import com.jy.shop.pojo.ContentCategory;

@Controller
@RequestMapping("/page")
public class ContentCategoryController {

	@Autowired
	private ContentCategoryService contentCategoryService;
	
	/**
	 * 内容类目树展示
	 * @return
	 */
	//http://localhost:9002/restful/page/contentcategory
	@GetMapping("contentcategory")
	@ResponseBody
	public List<ContentCategory> searchList(){
		ContentCategory contentCategory = new ContentCategory();
		contentCategory.setParentId(null);
		List<ContentCategory> list = null;
		try {
			list = contentCategoryService.queryByCondition(contentCategory);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	//http://localhost:9002/restful/page/contentcategory
	@PostMapping("/contentcategory")
	@ResponseBody
	public ResponseEntity<Boolean> save(ContentCategory cc){
		System.out.println(cc);
		try {
			boolean flag = contentCategoryService.add(cc);
			return new ResponseEntity<Boolean>(flag, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
