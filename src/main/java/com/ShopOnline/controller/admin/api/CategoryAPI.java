package com.ShopOnline.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ShopOnline.Utils.HttpUtil;
import com.ShopOnline.model.CategoryModel;
import com.ShopOnline.service.ICategoryService;
import com.fasterxml.jackson.databind.ObjectMapper;


@WebServlet(urlPatterns = "/api-admin-category")
public class CategoryAPI extends HttpServlet {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Inject
	ICategoryService categoryService;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//set định dạng kiểu dữ tiếng việt khi nhận dữ liệu từ client
		req.setCharacterEncoding("UTF-8");
		//set kiểu dữ liệu khi client nhận từ server là json
		resp.setContentType("application/json");
		//Mapper từ file json vào model
		CategoryModel categoryModel=HttpUtil.of(req.getReader()).toModel(CategoryModel.class);
		categoryModel=categoryService.save(categoryModel);
		
		ObjectMapper objectMapper=new ObjectMapper();
		objectMapper.writeValue(resp.getOutputStream(), categoryModel);
		
		
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//set định dạng kiểu dữ tiếng việt khi nhận dữ liệu từ client
		req.setCharacterEncoding("UTF-8");
		//set kiểu dữ liệu khi client nhận từ server là json
		resp.setContentType("application/json");
		//Mapper từ file json vào model
		CategoryModel categoryModel=HttpUtil.of(req.getReader()).toModel(CategoryModel.class);
		categoryModel=categoryService.update(categoryModel);
		ObjectMapper objectMapper=new ObjectMapper();
		
		objectMapper.writeValue(resp.getOutputStream(), categoryModel==null ? "{}" :categoryModel );
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		//set kiểu dữ liệu khi client nhận từ server là json
		resp.setContentType("application/json");
		//Mapper từ file json vào model
		Long[] ids=HttpUtil.of(req.getReader()).getIds();
		categoryService.delete(ids);
		
		ObjectMapper objectMapper=new ObjectMapper();
		objectMapper.writeValue(resp.getOutputStream(), "{}");
	}

}
