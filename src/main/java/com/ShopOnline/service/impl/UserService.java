package com.ShopOnline.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.ShopOnline.dao.IUserDao;
import com.ShopOnline.model.CategoryModel;
import com.ShopOnline.model.UserModel;
import com.ShopOnline.service.IUserService;

public class UserService implements IUserService {

	@Inject
	IUserDao userDao;

	@Override
	public UserModel findOne(Long userId) {

		return userDao.findOne(userId);
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public UserModel insert(UserModel model) {
		// TODO Auto-generated method stub
		Timestamp timestamp=new Timestamp(System.currentTimeMillis());
		model.setRegisteredAt(timestamp);
		Long id = userDao.insert(model);
		return findOne(id);
	}

	@Override
	public UserModel update(UserModel newUserModel) {
		userDao.update(newUserModel);
		UserModel oldUserModel = findOne(newUserModel.getId());
		setUserModel(newUserModel, oldUserModel);
		return findOne(newUserModel.getId());

	}

	private void setUserModel(UserModel newUserModel, UserModel oldUserModel) {
		if (newUserModel.getFirstName() == null) {
			newUserModel.setFirstName(oldUserModel.getFirstName());
		}
		if (newUserModel.getMiddleName() == null) {
			newUserModel.setMiddleName(oldUserModel.getMiddleName());
		}
		if (newUserModel.getLastName() == null) {
			newUserModel.setLastName(oldUserModel.getLastName());
		}
		if (newUserModel.getMobile() == null) {
			newUserModel.setMobile(oldUserModel.getMobile());
		}
		if (newUserModel.getEmail() == null) {
			newUserModel.setEmail(oldUserModel.getEmail());
		}
		if (newUserModel.getPasswordHash() == null) {
			newUserModel.setPasswordHash(oldUserModel.getPasswordHash());
		}
		if (newUserModel.getAdmin() == 0) {
			newUserModel.setAdmin(oldUserModel.getAdmin());
		}
		if (newUserModel.getVendor() == 0) {
			newUserModel.setVendor(oldUserModel.getVendor());
		}
		if (newUserModel.getLastLogin() == null) {
			newUserModel.setLastLogin(oldUserModel.getLastLogin());
		}
		if (newUserModel.getRegisteredAt() == null) {
			newUserModel.setRegisteredAt(oldUserModel.getRegisteredAt());
		}
		if (newUserModel.getProfile() == null) {
			newUserModel.setProfile(oldUserModel.getProfile());
		}
		if (newUserModel.getIntro() == null) {
			newUserModel.setIntro(oldUserModel.getIntro());

		}
		

	}

	@Override
	public void delete(Long[] userId) {
		for (Long id : userId) {
			userDao.delete(id);
		}
	}

}
