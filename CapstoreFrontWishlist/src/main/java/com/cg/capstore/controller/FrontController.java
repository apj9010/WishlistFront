package com.cg.capstore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.capstore.bean.ProductBean;
import com.cg.capstore.bean.WishlistBean;

@RestController
public class FrontController {
	
	@RequestMapping("/")
	public String controls() {
		return "Running Front...";
	}
	
	@RequestMapping(value="/wishlist")
	public ModelMap setWishlist(String productId, String customerId, ModelMap map) {
		System.err.println("In JSP Controller");
		RestTemplate restTemplate = new RestTemplate();
		
		System.err.println("Received Data..."+productId + "...Customer..."+customerId);
		
		Map<String, String> data = new HashMap<>();
		data.put("customerId", customerId);
		data.put("productId", productId);
		
		System.err.println("Sending Data..."+data.get("productId") + "...Customer..."+data.get("customerId"));
		ProductBean productBean = restTemplate.postForObject("http://localhost:6565/add",data, ProductBean.class);
		
		System.err.println("Added Data---"+productBean);
		
		WishlistBean wishlist = restTemplate.getForObject("http://localhost:6565/display?email="+customerId, WishlistBean.class);
		//List<ProductBean> wishlist = restTemplate.getForObject("http://localhost:6565/display?email="+customerId, List.class);
		System.err.println("Got Data---"+wishlist);
		System.err.println(wishlist.getProduct());
		
		map.put("wishlist", wishlist);
		
		System.err.println("Out JSP Controller");
		
		return map;
	}
	
}
