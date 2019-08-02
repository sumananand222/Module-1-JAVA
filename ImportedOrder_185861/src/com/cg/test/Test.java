package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import com.cg.bean.Order;
import com.cg.service.*;

class Test {
	OrderService os= new OrderServiceImpl();

	@org.junit.jupiter.api.Test
	void test() {
		//fail("Not yet implemented");
		Order o = new Order(10,100,2);
		System.out.println("Order Calculation Tested");
		assertTrue( os.calculateOrder(o) > 0);
	}
	void testOrder() {
		//fail("Not yet implemented");
		Order o = new Order(10,100,2);
		OrderService s = new OrderServiceImpl();
		System.out.println("Order Service Tested");
		assertTrue( s.calculateOrder(o) > 0);
	}
}


