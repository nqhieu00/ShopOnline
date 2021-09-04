package com.ShopOnline.service;

import java.util.List;
import java.util.Locale.Category;

import com.ShopOnline.model.CategoryModel;

public interface ICategoryService {
	
	List<CategoryModel> findAll();
	
	CategoryModel save(CategoryModel categoryModel);
	
	CategoryModel update(CategoryModel NewcategoryModel);
	void delete(Long[] categoryId);
}
