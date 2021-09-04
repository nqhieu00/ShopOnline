package com.ShopOnline.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.ShopOnline.dao.GenericDao;
import com.ShopOnline.mapper.RowMapper;

import java.sql.PreparedStatement;

public class AbstractDao<T> implements GenericDao<T> {

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/shop", user = "root", password = "123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			return null;
		}

	}

	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		
		List<T> results=new ArrayList<>();
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		try {
			connection=getConnection();
			statement=connection.prepareStatement(sql);
			if(parameters!=null) {
				setParameters(statement,parameters);
			}
			resultSet=statement.executeQuery();
			while(resultSet.next()) {
				results.add(rowMapper.mapRow(resultSet));
			}
			
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}

				if (resultSet != null) {
					resultSet.close();
				}
			} catch (Exception e2) {
				return null;
			}
			
		}
		return results;
	}

	private void setParameters(PreparedStatement statement, Object... parameters) throws SQLException {
		for(int i=0;i<parameters.length;i++) {
			Object parameter =parameters[i];
			int index=i+1;
			if(parameter instanceof Long) {
				statement.setLong(index, (long) parameter);
			}
			else if(parameter instanceof String) {
				statement.setString(index, (String) parameter);
			}
			else if(parameter instanceof Integer) {
				statement.setInt(index, (int) parameter);
			}
			else if(parameter instanceof Float) {
				statement.setFloat(index, (Float) parameter);
			}
			else if(parameter instanceof Timestamp) {
				statement.setTimestamp(index, (Timestamp)parameter);
			}
			else if(parameter == null) {
				statement.setNull(index, Types.NULL);
				
			}
			
		}
		
	}

	@Override
	public void update(String sql, Object... parameters) {
		PreparedStatement statement=null;
		Connection connection=null;
		try {
			connection=getConnection();
			connection.setAutoCommit(false);
			statement=connection.prepareStatement(sql);
			setParameters(statement, parameters);
			statement.executeUpdate();
			connection.commit();
			
			
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
		finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}

			} catch (Exception e2) {
				
			}
			
		}
		
		
	}
		
	@Override
	public Long insert(String sql, Object... parameters) {
		ResultSet resultSet=null;
		PreparedStatement statement=null;
		Connection connection=null;
		Long id=null;
		try {
			connection=getConnection();
			connection.setAutoCommit(false);
			statement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			setParameters(statement, parameters);
			statement.executeUpdate();
			resultSet=statement.getGeneratedKeys();
			while(resultSet.next()) {
				id=resultSet.getLong(1);
			}
			connection.commit();
			return id;
			
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
		finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}

				if (resultSet != null) {
					resultSet.close();
				}
			} catch (Exception e2) {
				return null;
			}
			
		}
		return id;
		
	}
}
