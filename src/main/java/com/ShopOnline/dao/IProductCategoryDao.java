package com.ShopOnline.dao;

import java.util.List;

import com.ShopOnline.model.ProductCategoryModel;

public interface IProductCategoryDao extends GenericDao<ProductCategoryModel> {
	
	List<ProductCategoryModel> findByCategoryId(Long id);

}
