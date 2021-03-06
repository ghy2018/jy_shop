package com.jy.shop.manager.service;

import java.util.List;

/**
 * 封装通用的 CRUD 操作
 * @author HXZY
 *
 */
public interface BaseService<T> {

	/**
	 * 新增
	 * 	全字段 SQL
	 * @param t
	 * @return
	 */
	boolean add(T t);
	
	/**
	 * 新增
	 * 	动态SQL
	 * @param t
	 * @return
	 */
	boolean addSelective(T t);
	
	/**
	 * 根据 id 删除指定记录
	 * @param id
	 * @return
	 */
	boolean removeById(Long id);
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	boolean removeIds(List<Object> ids);
	
	/**
	 * 更新
	 * 	全字段SQL
	 * @param t
	 * @return
	 */
	boolean modify(T t);
	
	/**
	 * 更新
	 * 	动态SQL
	 * @param t
	 * @return
	 */
	boolean modifySelective(T t);
	
	/**
	 * 根据 id 查询单个对象
	 * @param id
	 * @return
	 */
	T queryById(Long id);
	
	/**
	 * 根据条件查询集合
	 * @param t
	 * @return
	 */
	List<T> queryByCondition(T t);
	
	/**
	 * 分页查询
	 * @param t
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	List<T> queryByPage(T t, Integer pageNum, Integer pageSize);
	
	/**
	 * 根据条件查询单个
	 * @param t
	 * @return
	 */
	T queryOne(T t);
	
	/**
	 * 查询总记录数
	 * @param t
	 * @return
	 */
	int queryCount(T t);
	
}
