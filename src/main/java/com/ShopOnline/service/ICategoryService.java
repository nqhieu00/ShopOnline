package com.ShopOnline.service;

import java.util.List;
import java.util.Locale.Category;

import com.ShopOnline.model.CategoryModel;
import com.ShopOnline.paging.Pageable;

public interface ICategoryService {
	
	List<CategoryModel> findAll(Pageable pageable);
	int count();
	CategoryModel save(CategoryModel categoryModel);
	CategoryModel update(CategoryModel NewcategoryModel);
	void delete(Long[] categoryId);
}
