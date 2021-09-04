package com.ShopOnline.model;

import java.sql.Timestamp;
import java.util.Date;

public class CartModel {
	private long id;
	private long userId;
	private String sessionId;
	private String token;
	private int status;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String mobile;
	private String line1;
	private String line2;
	private String city;
	private String province;
	private String country;
	private Timestamp createAt;
	private Timestamp updateAt;
	private String content;
	
	public CartModel() {
		// TODO Auto-generated constructor stub
	}

	public CartModel(long id, long userId, String sessionId, String token, int status, String firstName,
			String middleName, String lastName, String email, String mobile, String line1, String line2, String city,
			String province, String country, Timestamp createAt, Timestamp updateAt, String content) {
		
		this.id = id;
		this.userId = userId;
		this.sessionId = sessionId;
		this.token = token;
		this.status = status;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.province = province;
		this.country = country;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
