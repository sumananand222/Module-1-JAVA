package com.capgemini.takehome.service;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.ProductDAO;

public class ProductService implements IProductService{

	ProductDAO dao=new ProductDAO();
	@Override
	public Product getProductDetails(int product_code) {
		return dao.getProductDetails(product_code);
	}

}
