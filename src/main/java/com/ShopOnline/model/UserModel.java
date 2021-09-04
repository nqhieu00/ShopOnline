package com.ShopOnline.model;

import java.sql.Timestamp;

public class UserModel {
	private long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String mobile;
	private String passwordHash;
	private int admin;
	private int vendor;
	private Timestamp registeredAt;
	private Timestamp lastLogin;
	private String intro;
	private String profile;
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}

	public UserModel(long id, String firstName, String middleName, String lastName, String email, String mobile,
			String passwordHash, int admin, int vendor, Timestamp registeredAt, Timestamp lastLogin, String intro,
			String profile) {
	
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.passwordHash = passwordHash;
		this.admin = admin;
		this.vendor = vendor;
		this.registeredAt = registeredAt;
		this.lastLogin = lastLogin;
		this.intro = intro;
		this.profile = profile;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public int getVendor() {
		return vendor;
	}

	public void setVendor(int vendor) {
		this.vendor = vendor;
	}

	public Timestamp getRegisteredAt() {
		return registeredAt;
	}

	public void setRegisteredAt(Timestamp registeredAt) {
		this.registeredAt = registeredAt;
	}

	public Timestamp getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	

}
