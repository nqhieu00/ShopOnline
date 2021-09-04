package com.ShopOnline.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ShopOnline.model.ProductCategoryModel;

public class ProductCategoryMapper implements RowMapper<ProductCategoryModel> {

	@Override
	public ProductCategoryModel mapRow(ResultSet resultSet) {
		// TODO Auto-generated method stub
		ProductCategoryModel productCategoryModel=new ProductCategoryModel();
		try {
			productCategoryModel.setCategoryId(resultSet.getLong("categoryId"));
			productCategoryModel.setProductId(resultSet.getLong("productId"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
		return productCategoryModel;
	}

}
