package com.ShopOnline.model;

import java.sql.Timestamp;

public class CartItemModel {
	private long id;
	private long productId;
	private long cartId;
	private String sku;
	private float price;
	private float discount;
	private float quantity;
	private int active;
	private Timestamp createAt;
	private Timestamp updateAt;
	private String content;
	
	public CartItemModel() {
		// TODO Auto-generated constructor stub
	}

	public CartItemModel(long id, long productId, long cartId, String sku, float price, float discount, float quantity,
			int active, Timestamp createAt, Timestamp updateAt, String content) {
		
		this.id = id;
		this.productId = productId;
		this.cartId = cartId;
		this.sku = sku;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.active = active;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Timestamp getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}

	public Timestamp getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
