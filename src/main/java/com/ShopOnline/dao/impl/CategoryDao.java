package com.ShopOnline.dao.impl;

import java.util.List;

import com.ShopOnline.dao.ICategoryDao;
import com.ShopOnline.mapper.CategoryMapper;
import com.ShopOnline.mapper.CountMapper;
import com.ShopOnline.model.CategoryModel;
import com.ShopOnline.paging.Pageable;

public class CategoryDao extends AbstractDao<CategoryModel> implements ICategoryDao {

	@Override
	public List<CategoryModel> findAll(Pageable pageable) {
		
		StringBuilder query =new StringBuilder("SELECT * FROM category");
		if(pageable.getSorter()!=null) {
			query.append(" ORDER BY "+pageable.getSorter().getSortName()+" "+pageable.getSorter().getSortBy());
		}
		if(pageable.getPage()!=null && pageable.getOffset()!=null) {
			query.append(" LIMIT "+pageable.getLimit()+" OFFSET "+pageable.getOffset());
		}
		
		return query(query.toString(),new CategoryMapper());
	}

	@Override
	public Long save(CategoryModel categoryModel) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO category(parentId,title,metaTitle,slug,content) VALUES(?,?,?,?,?)"; 
		return insert(query,categoryModel.getParentId(), categoryModel.getTitle(),categoryModel.getMetaTitle(),categoryModel.getSlug(),categoryModel.getContent());
	}

	@Override
	public CategoryModel findOne(Long categoryId) {
		
		String query = "SELECT * FROM category WHERE id =?";
		List<CategoryModel> categoryModels=query(query,new CategoryMapper(), categoryId);
		return categoryModels.isEmpty() ? null : categoryModels.get(0);
		
	}

	@Override
	public void update(CategoryModel categoryModel) {
		StringBuilder query=new StringBuilder();
		query.append("UPDATE category SET parentId = ?");
		query.append(" ,title = ? ,metaTitle = ? ,slug = ? ,content = ? WHERE id = ?");
		
		update(query.toString(),categoryModel.getParentId(),categoryModel.getTitle(),categoryModel.getMetaTitle(),
				categoryModel.getSlug(),categoryModel.getContent(),categoryModel.getId());
		
	}

	@Override
	public void delete(Long categoryId) {
		String query="DELETE FROM category WHERE id = ?";
		update(query, categoryId);
		
		
	}

	@Override
	public int count() {
		String query="SELECT COUNT(*) FROM category";
		return query(query, new CountMapper(), null).get(0);
	}



}
