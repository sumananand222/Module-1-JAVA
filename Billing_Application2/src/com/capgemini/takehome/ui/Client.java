package com.capgemini.takehome.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.service.ProductService;
import com.capgemini.takehome.service.Validation;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ProductService service=new ProductService();
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
					int p_c,qty;
					System.out.println("Enter Product Details ");
					System.out.println("Enter the product code: ");
					while(true)
					{
					String product_code=br.readLine();
					boolean b1 = Validation.validatedata(product_code,Validation.productcodepattern);
					if(b1 == true)
					{
						try 
						{
							p_c = Integer.parseInt(product_code);
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
					Product p = service.getProductDetails(p_c);
					if(p != null) {
					p.setQuantity(qty);
					System.out.println("Product Name: "+p.getName());
					System.out.println("Product Category: "+p.getCategory());
					System.out.println("Product Price: "+p.getPrice());
					System.out.println("Quantity: "+p.getQuantity());
					System.out.println("Line Total: "+p.getQuantity()*p.getPrice());
					}
					else
					{
						System.out.println("No item found.Please try again!");
					}
					
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
