package com.cg.service;

import com.cg.bean.Order;
import com.cg.dao.OrderRepo;
import com.cg.dao.OrderRepoImpl;

public class OrderServiceImpl implements OrderService{
	
	OrderRepo dao= new OrderRepoImpl();
	public int calculateOrder(Order bean) {
		return dao.saveOrder(bean);	
	}
}
