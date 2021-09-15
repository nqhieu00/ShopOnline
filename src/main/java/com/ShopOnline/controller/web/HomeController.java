package com.ShopOnline.controller.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ShopOnline.constant.SystemConstant;
import com.ShopOnline.model.ProductModel;
import com.ShopOnline.service.ICategoryService;
import com.ShopOnline.service.IProductService;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	@Inject
	private IProductService productService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<ProductModel> productModels = productService.findAll();
		req.setAttribute(SystemConstant.MODEL, productModels);
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
