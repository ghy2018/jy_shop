package com.jy.shop.manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jy.shop.common.DataTableJSONResponse;
import com.jy.shop.manager.service.ContentService;
import com.jy.shop.pojo.Content;

@Controller
@RequestMapping("/page")
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	//http://localhost:9002/restful/page/content
	@DeleteMapping("/content")
	@ResponseBody
	public Boolean add(String ids) {
		String[] strIds = ids.split(",");
		List<Object> list = new ArrayList<>();
		for (String id : strIds) {
			list.add(id);
		}
		boolean flag = false;
		try {
			flag = contentService.removeIds(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 新增内容
	 * @param content
	 * @return
	 */
	//http://localhost:9002/restful/page/content
	@PostMapping("/content")	
	@ResponseBody
	public Boolean add(Content content) {
		//System.out.println(content);
		boolean flag = false;
		try {
			flag = contentService.add(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 内容列表展示
	 * 分页
	 */
	//http://localhost:9002/restful/page/content/
	@GetMapping("/content")
	@ResponseBody
	public DataTableJSONResponse searchList(@RequestParam(value="aodata",required=false) String aodata, 
			@RequestParam(value="categoryId",required=false) Long categoryId){
		
		Integer sEcho = 0;
		Integer iDisplayStart = 0;
		Integer iDisplayLength = 0;
		if(null != aodata){
			JSONArray jsonArray = new JSONArray(aodata);
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObject = (JSONObject) jsonArray.get(i);
				if("sEcho".equals(jsonObject.get("name"))){
					sEcho = jsonObject.getInt("value");
				}
				if("iDisplayStart".equals(jsonObject.get("name"))){
					iDisplayStart = jsonObject.getInt("value");
				}
				if("iDisplayLength".equals(jsonObject.get("name"))){
					iDisplayLength = jsonObject.getInt("value");
				}
			}
		}
		
		List<Content> aaData = null;
		
		Content content = new Content();
		
		if(null != categoryId){
			content.setCategoryId(categoryId);
		}
		Integer count = 0;
		try {
			List<Content> list = contentService.queryByCondition(content);
			count = contentService.queryCount(content);
			if(count > iDisplayLength) {
				if(count - iDisplayStart > iDisplayLength){
					//分页
					aaData = list.subList(iDisplayStart, iDisplayStart + iDisplayLength);
				} else {
					//最后一页
					aaData = list.subList(iDisplayStart, count);
				}
			} else {
				aaData = list;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		DataTableJSONResponse result = new DataTableJSONResponse(sEcho, count, count, aaData);
		return result;
	}
	
}
