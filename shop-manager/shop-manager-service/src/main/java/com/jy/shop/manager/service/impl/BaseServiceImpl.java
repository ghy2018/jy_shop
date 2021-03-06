package com.jy.shop.manager.service.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.abel533.entity.Example;
import com.github.abel533.entity.Example.Criteria;
import com.github.abel533.mapper.Mapper;
import com.github.pagehelper.PageHelper;
import com.jy.shop.manager.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	private Mapper<T> mapper;
	
	private Class clz;
	
	public BaseServiceImpl(){
		Type type = this.getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType)type;
		clz = (Class) pt.getActualTypeArguments()[0];
	}
	
	
	@Override
	public boolean add(T t) {
		return mapper.insert(t) > 0 ? true : false;
	}

	@Override
	public boolean addSelective(T t) {
		return mapper.insertSelective(t) > 0 ? true : false;
	}

	@Override
	public boolean removeById(Long id) {
		return mapper.deleteByPrimaryKey(id) > 0 ? true : false;
	}

	@Override
	public boolean removeIds(List<Object> ids) {
		Example example = new Example(clz);
		Criteria criteria = example.createCriteria();
		criteria.andIn("id", ids);
		return mapper.deleteByExample(example) > 0 ? true : false;
	}

	@Override
	public boolean modify(T t) {
		return mapper.updateByPrimaryKey(t) > 0 ? true : false;
	}

	@Override
	public boolean modifySelective(T t) {
		return mapper.updateByPrimaryKeySelective(t) > 0 ? true : false;
	}

	@Override
	public T queryById(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<T> queryByCondition(T t) {
		return mapper.select(t);
	}

	@Override
	public List<T> queryByPage(T t, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.select(t);
	}

	@Override
	public T queryOne(T t) {
		return mapper.selectOne(t);
	}

	@Override
	public int queryCount(T t) {
		return mapper.selectCount(t);
	}

}
