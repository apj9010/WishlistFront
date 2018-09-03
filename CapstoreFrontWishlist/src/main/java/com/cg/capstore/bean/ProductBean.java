package com.cg.capstore.bean;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown= true)

public class ProductBean {

	
	private String productId;
	
	private String productName;
	
	private Double price;

	private List<MerchantBean> merchant;
	
	private Double quantity;

	private String category;
	
	private PromosBean promoCode;
	
	private DiscountBean discount;
	
	private List<ImageBean> imageId;
	
	private List<FeedbackProductBean> feedbackProduct;
	

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<MerchantBean> getMerchant() {
		return merchant;
	}

	public void setMerchant(List<MerchantBean> merchant) {
		this.merchant = merchant;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public PromosBean getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(PromosBean promoCode) {
		this.promoCode = promoCode;
	}

	public DiscountBean getDiscount() {
		return discount;
	}

	public void setDiscount(DiscountBean discount) {
		this.discount = discount;
	}

	public List<ImageBean> getImageId() {
		return imageId;
	}

	public void setImageId(List<ImageBean> imageId) {
		this.imageId = imageId;
	}

	public List<FeedbackProductBean> getFeedbackProduct() {
		return feedbackProduct;
	}

	public void setFeedbackProduct(List<FeedbackProductBean> feedbackProduct) {
		this.feedbackProduct = feedbackProduct;
	}

	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", merchant=" + merchant + ", quantity=" + quantity + ", category=" + category + ", promoCode="
				+ promoCode + ", discount=" + discount + ", imageId=" + imageId + ", feedbackProduct=" + feedbackProduct
				+ "]";
	}
	
	

}