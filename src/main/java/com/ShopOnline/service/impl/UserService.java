package com.ShopOnline.service.impl;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import org.bouncycastle.util.encoders.Hex;

import com.ShopOnline.dao.IUserDao;
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
		setPasswordHash(model);
		Long id = userDao.insert(model);
		return findOne(id);
	}

	private void setPasswordHash(UserModel model) {
		String originalString=model.getPassword();
		String sha256hex="";
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));
			sha256hex = new String(Hex.encode(hash));
			model.setPasswordHash(sha256hex);
		} catch (Exception e) {
			
		}
		
	}

	@Override
	public UserModel update(UserModel newUserModel) {
		
		if(findOne(newUserModel.getId())!= null){
			UserModel oldUserModel = findOne(newUserModel.getId());
			setUserModel(newUserModel, oldUserModel);
		}
		setPasswordHash(newUserModel);
		userDao.update(newUserModel);
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
		if (newUserModel.getPassword() == null) {
			newUserModel.setPassword(oldUserModel.getPassword());
		}
		if (newUserModel.getAdmin() == null) {
			newUserModel.setAdmin(oldUserModel.getAdmin());
		}
		if (newUserModel.getVendor() == null) {
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

	@Override
	public UserModel findByUserNameAndPasswordHash(String userName, String passwordHash) {
		return userDao.findByUserNameAndPasswordHash(userName, passwordHash);
	}

}
