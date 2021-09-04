package com.ShopOnline.model;

import java.sql.Timestamp;

public class ProductModel {
	
	private long id;
	private long userId;
	private String title;
	private String metaTitle;
	private String slug;
	private String summary;
	private int type;
	private String sku;
	private float price;
	private float discount;
	private float quantily;
	private int shop;
	private Timestamp createAt;
	private Timestamp updateAt;
	private Timestamp publisheAt;
	private Timestamp startsAt;
	private Timestamp endsAt;
	private String content;
	
	
	public ProductModel() {
		// TODO Auto-generated constructor stub
	}
	public ProductModel(int id, int userId, String title, String metaTitle, String slug, String summary, int type,
			String sku, float price, float discount, float quantily, int shop, Timestamp createAt, Timestamp updateAt,
			Timestamp publisheAt, Timestamp startsAt, Timestamp endsAt, String content) {
		
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
		this.quantily = quantily;
		this.shop = shop;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.publisheAt = publisheAt;
		this.startsAt = startsAt;
		this.endsAt = endsAt;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
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
	public int getType() {
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
	public float getQuantily() {
		return quantily;
	}
	public void setQuantily(float quantily) {
		this.quantily = quantily;
	}
	public int getShop() {
		return shop;
	}
	public void setShop(int shop) {
		this.shop = shop;
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
	public Timestamp getPublisheAt() {
		return publisheAt;
	}
	public void setPublisheAt(Timestamp publisheAt) {
		this.publisheAt = publisheAt;
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
	
}
