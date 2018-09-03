package com.cg.capstore.bean;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)
public class WishlistBean {
	
	
	private String wishlistId;
	
	
	private List<ProductBean> product;

	public String getWishlistId() {
		return wishlistId;
	}

	public void setWishlist(String wishlistId) {
		this.wishlistId = wishlistId;
	}

	public List<ProductBean> getProduct() {
		return product;
	}

	public void setProduct(List<ProductBean> product) {
		this.product = product;
	}

	public WishlistBean(String wishlistId, List<ProductBean> productId) {
		super();
		this.wishlistId = wishlistId;
		this.product = productId;
	}
	public WishlistBean() {
		
	}

	@Override
	public String toString() {
		return "WishlistBean [wishlistId=" + wishlistId + ", product=" + product + "]";
	}
	
}