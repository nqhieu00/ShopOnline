package com.ShopOnline.dao.impl;

import java.util.List;

import com.ShopOnline.dao.IUserDao;
import com.ShopOnline.mapper.UserMapper;
import com.ShopOnline.model.UserModel;

public class UserDao extends AbstractDao<UserModel> implements IUserDao {

	@Override
	public List<UserModel> findAll() {
		String sql="SELECT * FROM user";
		return query(sql, new UserMapper(), null);
	}

	@Override
	public UserModel findOne(Long userId) {
		StringBuilder sql=new StringBuilder("SELECT * FROM user WHERE id = ?");
		List<UserModel> userModels=query(sql.toString(), new UserMapper(), userId);
		return userModels.isEmpty()? null :userModels.get(0);
		
		
	}

	@Override
	public Long insert(UserModel model) {
		StringBuilder sql=new StringBuilder("INSERT INTO user");
		sql.append("(firstName, middleName, lastName, mobile,email,passwordHash,registeredAt,lastLogin)");
		sql.append( "values(?,?,?,?,?,?,?,?) ");
		return insert(sql.toString(),model.getFirstName(),model.getMiddleName(),model.getLastName(),model.getMobile(),
				model.getEmail(),model.getPasswordHash(),model.getRegisteredAt(),model.getLastLogin());
	}

	@Override
	public void update(UserModel model) {
		StringBuilder sql=new StringBuilder("UPDATE user SET ");
		sql.append("firstName = ?, middleName = ?, lastName = ?, mobile = ?,email = ?,passwordHash = ?,admin = ?,vendor = ?,registeredAt = ?,lastLogin = ?,intro = ?,profile = ?");
		sql.append( " WHERE id = ?");
	
		
		update(sql.toString(),model.getFirstName(),model.getMiddleName(),model.getLastName(),model.getMobile(),
				model.getEmail(),model.getPasswordHash(),model.getAdmin(),model.getVendor(),model.getRegisteredAt()
				,model.getLastLogin(),model.getIntro(),model.getProfile(),model.getId());
		
	}

	@Override
	public void delete(Long userId) {
		StringBuilder sql=new StringBuilder("DELETE FROM user where id = ?");
		update(sql.toString(),userId);
		
	}

	@Override
	public UserModel findByUserNameAndPasswordHash(String userName, String passwordHash) {
		StringBuilder sql=new StringBuilder("SELECT * FROM user WHERE email = ? and passwordHash = ?"); 
		List<UserModel> userModels=query(sql.toString(), new UserMapper(), userName,passwordHash);
		return userModels.isEmpty()? null :userModels.get(0);
	}

}
