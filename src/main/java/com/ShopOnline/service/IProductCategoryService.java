package com.ShopOnline.service;

import java.util.List;

import javax.inject.Inject;

import com.ShopOnline.model.ProductCategoryModel;

public interface IProductCategoryService {
	
	List<ProductCategoryModel> findByCategoryId(Long categoryId);
}
