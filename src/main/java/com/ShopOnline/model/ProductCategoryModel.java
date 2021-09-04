package com.ShopOnline.model;

public class ProductCategoryModel {
	private long productId;
	private long categoryId;
	
	public ProductCategoryModel() {
		// TODO Auto-generated constructor stub
	}

	public ProductCategoryModel(int productId, int categoryId) {
		
		this.productId = productId;
		this.categoryId = categoryId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	
}
