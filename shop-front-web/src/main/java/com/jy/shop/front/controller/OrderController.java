package com.jy.shop.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

	@GetMapping("/orderinfo.html")
	public String toOrderInfo(){
		return "orderinfo";
	}
	
}
