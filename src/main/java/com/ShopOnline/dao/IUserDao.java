package com.ShopOnline.dao;

import java.util.List;

import com.ShopOnline.model.UserModel;

public interface IUserDao {
	
	UserModel findOne(Long userId);
	List<UserModel> findAll();
	Long insert(UserModel model);
	void update(UserModel userModel);
	void delete(Long userId);

}
