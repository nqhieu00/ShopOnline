package com.ShopOnline.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.ShopOnline.dao.IProductCategoryDao;
import com.ShopOnline.dao.impl.ProductCategoryDao;
import com.ShopOnline.model.ProductCategoryModel;
import com.ShopOnline.service.IProductCategoryService;

public class ProductCategoryService implements IProductCategoryService {

	@Inject
	IProductCategoryDao productCategoryDao;
	@Override
	public List<ProductCategoryModel> findByCategoryId(Long categoryId) {
		// TODO Auto-generated method stub
		return productCategoryDao.findByCategoryId(categoryId);
	}
	
	

}
