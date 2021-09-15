package com.ShopOnline.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ShopOnline.model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel> {

	
	@Override
	public CategoryModel mapRow(ResultSet resultSet) {
		// TODO Auto-generated method stub
		CategoryModel category = new CategoryModel();
		try {
			
			category.setId(resultSet.getLong("id"));
			if(resultSet.getLong("parentId")==0) {
				category.setParentId(null);
			}
			else {
				category.setParentId(resultSet.getLong("parentId"));
			}
			category.setTitle(resultSet.getString("title"));
			category.setMetaTitle(resultSet.getString("metaTitle"));
			category.setSlug(resultSet.getString("slug"));
			category.setContent(resultSet.getString("content"));
			
			
		} catch (SQLException  e ) {
			System.out.println(e);
			return null;
		}
		return category;
		
		
	}

}
