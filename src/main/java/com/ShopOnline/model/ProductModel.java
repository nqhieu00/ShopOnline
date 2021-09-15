package com.ShopOnline.model;

import java.sql.Timestamp;

public class ProductModel {
	
	private Long id;
	private Long userId;
	private String title;
	private String metaTitle;
	private String slug;
	private String summary;
	private Integer type;
	private String sku;
	private float price;
	private float discount;
	private float quantity;
	private Integer shop;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp publishedAt;
	private Timestamp startsAt;
	private Timestamp endsAt;
	private String content;
	private String thumbnail;
	
	
	public ProductModel() {
		// TODO Auto-generated constructor stub
	}


	public ProductModel(Long id, Long userId, String title, String metaTitle, String slug, String summary, int type,
			String sku, float price, float discount, float quantily, int shop, Timestamp createdAt, Timestamp updatedAt,
			Timestamp publishedAt, Timestamp startsAt, Timestamp endsAt, String content,String thumbnail) {
		
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.metaTitle = metaTitle;
		this.slug = slug;
		this.summary = summary;
		this.type = type;
		this.sku = sku;
		this.price = price;
		this.discount = discount;
		this.quantity = quantily;
		this.shop = shop;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.publishedAt = publishedAt;
		this.startsAt = startsAt;
		this.endsAt = endsAt;
		this.content = content;
		this.thumbnail=thumbnail;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getMetaTitle() {
		return metaTitle;
	}


	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}


	public String getSlug() {
		return slug;
	}


	public void setSlug(String slug) {
		this.slug = slug;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}


	public Integer getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Float getDiscount() {
		return discount;
	}


	public void setDiscount(float discount) {
		this.discount = discount;
	}


	public Float getQuantity() {
		return quantity;
	}


	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}


	public Integer getShop() {
		return shop;
	}


	public void setShop(int shop) {
		this.shop = shop;
	}


	public Timestamp getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}


	public Timestamp getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}


	public Timestamp getPublishedAt() {
		return publishedAt;
	}


	public void setPublishedAt(Timestamp publishedAt) {
		this.publishedAt = publishedAt;
	}


	public Timestamp getStartsAt() {
		return startsAt;
	}


	public void setStartsAt(Timestamp startsAt) {
		this.startsAt = startsAt;
	}


	public Timestamp getEndsAt() {
		return endsAt;
	}


	public void setEndsAt(Timestamp endsAt) {
		this.endsAt = endsAt;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getThumbnail() {
		return thumbnail;
	}


	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}
