package com.cg.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.bean.Order;
import com.cg.service.OrderService;
import com.cg.service.OrderServiceImpl;
import com.cg.service.Validation;


public class ImportedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OrderService service= new OrderServiceImpl();
		while(true) {
			System.out.println("==============MENU====================");
	        System.out.println("1. Generate Bill ");
	        System.out.println("2. EXIT");
	        System.out.println("Enter your choice\n");
	        String choice;
			try {
				choice = br.readLine();
				switch (choice) {
				case "1":
					double price;
					int qty;
					System.out.println("Enter Order Details ");
					System.out.println("Enter the price in dollar: ");
					while(true)
					{
					String pr=br.readLine();
					boolean b1 = Validation.compareData(pr);
					if(b1 == true)
					{
						try 
						{
							price = Double.parseDouble(pr);
							break;
						}
						catch(Exception e)
						{
							System.out.println("Enter Again!!!");
						}
					}
					else
					{
						System.out.println("Wrong details Enter Again!!!");
					}
					}
					
					System.out.println("Enter the quantity: ");
					while(true)
					{
					String quantity=br.readLine();
					boolean b1 = Validation.validatedata(quantity, Validation.quantitypattern);
					if(b1 == true)
					{
						try 
						{	
							qty = Integer.parseInt(quantity);
							break;
						}
						catch(Exception e)
						{
							System.out.println("Enter Again!!!");
						}
					}
					else
					{
						System.out.println("Wrong input.Enter Valid characters/Numbers:");
					}
					}
					int id = (int) (Math.random()*1000);
					Order o = new Order(id, price, qty);
					service.calculateOrder(o);
					//					Order p = service.calculateOrder();
					System.out.println("**********Bill**********");
					System.out.println("Order ID: "+o.getId());
					System.out.println("Product Price: $"+o.getPrice());
					System.out.println("Product Quantity: "+o.getQuantity());
					System.out.println("Charges: Rs."+o.getCharges());
					System.out.println("Amount: Rs."+o.getAmount());
					System.out.println("********Thank You********\n");
					
					break;
					
				case "2":
						
						System.out.println("Thank You have a nice day!");
					   System.exit(0);
	                   break;
	                   
	            default:
	            	  System.out.println("Invalid choice");
		        }
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }
	}

}
