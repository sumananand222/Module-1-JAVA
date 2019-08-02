package com.capgemini.takehome.util;

import java.util.*;

import com.capgemini.takehome.bean.Product;
public class CollectionUtil {
	private static Map<Integer,Product> products=new HashMap<Integer,Product>();
	static {
		products.put(1001, new Product(1001,"iphone","electronics",35000));
		products.put(1002, new Product(1002,"ledtv","electronics",45000));
		products.put(1003, new Product(1003,"teddy","toy",800));
		products.put(1004, new Product(1004,"telescope","toy",5000));
	}
	public static Map<Integer, Product> details()
	{
		return products;
	}
}
