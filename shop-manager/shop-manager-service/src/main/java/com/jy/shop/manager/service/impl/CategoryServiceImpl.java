package com.jy.shop.manager.service.impl;

import org.springframework.stereotype.Service;

import com.jy.shop.manager.service.CategoryService;
import com.jy.shop.pojo.Category;

@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {
/*
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public boolean add(Category category) {
		return categoryMapper.insertSelective(category) > 0 ? true : false;
	}

	@Override
	public List<Category> queryList() {
		return categoryMapper.select(null);
	}
	
	*/
}
