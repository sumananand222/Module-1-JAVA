package com.cg.dao;

import com.cg.bean.Order;

public interface OrderRepo {
	int saveOrder(Order bean);
}
