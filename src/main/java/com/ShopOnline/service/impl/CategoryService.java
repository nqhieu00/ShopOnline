package com.ShopOnline.service.impl;

import java.util.List;
import java.util.Locale.Category;

import javax.inject.Inject;

import com.ShopOnline.dao.ICategoryDao;
import com.ShopOnline.dao.impl.CategoryDao;
import com.ShopOnline.model.CategoryModel;
import com.ShopOnline.service.ICategoryService;
import com.google.protobuf.Empty;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDao categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

	@Override
	public CategoryModel save(CategoryModel categoryModel) {
		// TODO Auto-generated method stub
		Long id = categoryDao.save(categoryModel);
		return categoryDao.findOne(id);
	}

	@Override
	public CategoryModel update(CategoryModel newCategoryModel) {

		CategoryModel oldCategoryModel = categoryDao.findOne(newCategoryModel.getId());

		setCategory(newCategoryModel, oldCategoryModel);

		categoryDao.update(newCategoryModel);
		return categoryDao.findOne(newCategoryModel.getId());

	}

	private void setCategory(CategoryModel newCategoryModel, CategoryModel oldCategoryModel) {
		if (newCategoryModel.getParentId() == 0) {
			newCategoryModel.setParentId(oldCategoryModel.getParentId());
		} 
		if (newCategoryModel.getTitle() == null) {
			newCategoryModel.setTitle(oldCategoryModel.getTitle());
		} 
		if (newCategoryModel.getMetaTitle() == null) {
			newCategoryModel.setMetaTitle(oldCategoryModel.getMetaTitle());
		}
		if (newCategoryModel.getSlug() == null) {
			newCategoryModel.setSlug(oldCategoryModel.getSlug());
		}
		if (newCategoryModel.getContent() == null) {
			newCategoryModel.setContent(oldCategoryModel.getContent());
		}

	}

	@Override
	public void delete(Long[] categoryId) {
		for (Long id : categoryId) {
			categoryDao.delete(id);
		}

	}

}
