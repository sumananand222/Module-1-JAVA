package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Order;

public class OrderRepoImpl implements OrderRepo {
	public static Map<Integer,Order> ordermap=new HashMap<Integer,Order>();
	
	public int saveOrder(Order bean) {
		ordermap.put(bean.getId(),bean);
		return 1;
	}
}
