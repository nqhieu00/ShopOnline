package com.ShopOnline.dao;

import java.util.List;

import com.ShopOnline.model.CategoryModel;

public interface ICategoryDao extends GenericDao<CategoryModel> {
	List<CategoryModel> findAll();
	CategoryModel findOne(Long categoryId);
	Long save(CategoryModel categoryModel);
	void update(CategoryModel categoryModel);
	void delete(Long categoryId);
}
