package com.ShopOnline.service;

import java.util.List;

import com.ShopOnline.model.CategoryModel;
import com.ShopOnline.model.UserModel;

public interface IUserService {
	
	UserModel findOne(Long userId);
	UserModel findByUserNameAndPasswordHash(String userName,String passwordHash);
	List<UserModel> findAll();
	UserModel insert(UserModel model);
	UserModel update(UserModel userModel);
	void delete(Long[] userId);

}
