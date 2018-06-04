package com.jy.shop.manager.service;

import java.util.List;

import com.jy.shop.pojo.Category;

public interface CategoryService {

	public boolean add(Category category);

	public List<Category> queryList();
	
	
}
