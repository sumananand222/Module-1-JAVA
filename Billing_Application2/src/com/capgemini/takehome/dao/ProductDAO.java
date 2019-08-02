package com.capgemini.takehome.dao;

import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {
	CollectionUtil colu = new CollectionUtil();

	@Override
	public Product getProductDetails(int product_code) {
		Map<Integer,Product> mp = colu.details();
		Product p = mp.get(product_code);
		return  p;
	}

}
