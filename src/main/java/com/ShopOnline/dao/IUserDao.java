package com.ShopOnline.dao;

import java.util.List;

import com.ShopOnline.model.UserModel;

public interface IUserDao extends GenericDao<UserModel> {
	
	UserModel findOne(Long userId);
	UserModel findByUserNameAndPasswordHash(String userName,String passwordHash);
	List<UserModel> findAll();
	Long insert(UserModel model);
	void update(UserModel userModel);
	void delete(Long userId);

}
