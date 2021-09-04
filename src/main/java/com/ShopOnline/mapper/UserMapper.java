package com.ShopOnline.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ShopOnline.model.UserModel;

public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet resultSet) {
		// TODO Auto-generated method stub
		UserModel model=new UserModel();
		try {
			model.setId(resultSet.getLong("id"));
			model.setFirstName(resultSet.getString("firstName"));
			model.setMiddleName(resultSet.getString("middleName"));
			model.setLastName(resultSet.getString("lastName"));
			model.setMobile(resultSet.getString("mobile"));
			model.setEmail(resultSet.getString("email"));
			model.setPasswordHash(resultSet.getString("passwordHash"));
			model.setAdmin(resultSet.getInt("admin"));
			model.setVendor(resultSet.getInt("vendor"));
			
			model.setRegisteredAt(resultSet.getTimestamp("registeredAt"));
			model.setLastLogin(resultSet.getTimestamp("lastLogin"));
			
			model.setIntro(resultSet.getString("intro"));
		} catch (Exception e) {
			return null;
		}
		
		return model;
	}

}
