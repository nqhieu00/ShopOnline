package com.ShopOnline.dao;

import java.util.List;

import com.ShopOnline.model.CategoryModel;
import com.ShopOnline.paging.Pageable;

public interface ICategoryDao extends GenericDao<CategoryModel> {
	List<CategoryModel> findAll(Pageable pageable);
	int count();
	CategoryModel findOne(Long categoryId);
	Long save(CategoryModel categoryModel);
	void update(CategoryModel categoryModel);
	void delete(Long categoryId);
}
