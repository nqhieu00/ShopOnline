package com.ShopOnline.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ShopOnline.dao.IProductCategoryDao;
import com.ShopOnline.mapper.CategoryMapper;
import com.ShopOnline.mapper.ProductCategoryMapper;
import com.ShopOnline.model.ProductCategoryModel;

public class ProductCategoryDao extends AbstractDao<ProductCategoryModel> implements IProductCategoryDao  {

	@Override
	public List<ProductCategoryModel> findByCategoryId(Long categoryId) {
		
	
		
		String query = "SELECT * FROM product_category WHERE categoryId = ?";
		
		return query(query, new ProductCategoryMapper(), categoryId);
		
	}

}
