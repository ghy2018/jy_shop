package com.jy.shop.manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jy.shop.common.DataTableJSONResponse;
import com.jy.shop.manager.service.ProductService;
import com.jy.shop.pojo.Product;

@Controller
@RequestMapping("/page")
public class ProductController {

	//http://localhost:9002/restful/page/product
	@Autowired
	private ProductService productService;
	
	/**
	 * 新增商品
	 * @param product
	 * @return
	 */
	@ResponseBody
	@PostMapping("/product")
	public Boolean save(Product product){
		try{
			boolean flag = productService.addSelective(product);
			return flag;
		} catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * 商品列表展示
	 * @param cid
	 * @param aodata
	 * @return
	 */
	//http://localhost:9002/restful/page/product/
	@ResponseBody
	@GetMapping("/product/")
	public DataTableJSONResponse searchList(@RequestParam(value="cid",required=false)Long cid, 
			@RequestParam(value="aodata",required=false) String aodata){
		
		Integer sEcho = null;//当前访问的次数
		
		//最终要展示在页面上的集合的 起始下标 跟 条数
		Integer iDisplayStart = 0;//起始下标
		Integer iDisplayLength = 0;//每页显示条数
		
		//需要展示在页面上的集合
		List<Product> aaData = null;
		
		if(null != aodata){
			//把传递过来的json串转换成一个json对象
			JSONArray jsonArray = new JSONArray(aodata);
			
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				/*
				 *  {"name":"sEcho","value":1},
					{"name":"iColumns","value":5},
					{"name":"sColumns","value":",,,,"},
					{"name":"iDisplayStart","value":0},
					{"name":"iDisplayLength","value":10},
				 */
				
				Object object = jsonObject.get("name");
				if(object.equals("sEcho")){
					sEcho = jsonObject.getInt("value");
				}
				if(object.equals("iDisplayStart")){
					iDisplayStart = jsonObject.getInt("value");
				}
				if(object.equals("iDisplayLength")){
					iDisplayLength = jsonObject.getInt("value");
				}
			}
			
		} 
		
		Product p = new Product();
		
		if(null != cid){
			p.setCid(cid);
		}
		
		//查询到的集合数据
		List<Product> totalList = productService.queryByCondition(p);
		
		//查询的总记录数
		Integer count = productService.queryCount(p);//3094
		
		//一页展示几条数据   是由前端页面发送过来的
		
		//是否需要分页
		if(count > iDisplayLength){
			if(count - iDisplayStart > iDisplayLength){
				//起始行下标   - 结束行下标
				aaData = totalList.subList(iDisplayStart, iDisplayStart + iDisplayLength);
						//.subList(iDisplayStart, iDisplayStart + iDisplayLength);
				System.out.println(totalList.size());
			} else {
				//不需要分页,最后一页
				aaData = totalList.subList(iDisplayStart, count);
			}
		} else {
			aaData = totalList;
		}
		
		DataTableJSONResponse result = new DataTableJSONResponse();
		result.setsEcho(sEcho);
		result.setAaData(aaData);
		result.setiTotalDisplayRecords(count);
		result.setiTotalRecords(count);
		
		return result;
	}

	/**
	 * 批量删除
	 */
	//http://manager.shop.com/restful/page/product
	@ResponseBody
	@DeleteMapping("/product")
	public Boolean deleteMore(String ids){
		try {
			String[] idsStr = ids.split(",");
			List<Object> list = new ArrayList<>();
			for (int i = 0; i < idsStr.length; i++) {
				list.add(idsStr[i]);
			}
			boolean flag = productService.removeIds(list);
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
}
