package com.ShopOnline.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ShopOnline.Utils.HttpUtil;
import com.ShopOnline.model.UserModel;
import com.ShopOnline.service.IUserService;
import com.ShopOnline.service.impl.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.cj.util.Util;
@WebServlet(urlPatterns = "/api-admin-user")
public class UserAPI extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject IUserService UserService;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		UserModel user=HttpUtil.of(req.getReader()).toModel(UserModel.class);
		user=UserService.insert(user);
		ObjectMapper objectMapper=new ObjectMapper();
		objectMapper.writeValue(resp.getOutputStream(), user);
		
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		Long[] ids =HttpUtil.of(req.getReader()).getIds();
		UserService.delete(ids);
		ObjectMapper objectMapper=new ObjectMapper();
		objectMapper.writeValue(resp.getOutputStream(), "{}");
	}

}
