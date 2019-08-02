package com.cg.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.bean.Invoice;
import com.cg.service.*;

public class InvoiceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InvoiceService service= new InvoiceServiceImpl();
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
					double weight;
					int distance;
					System.out.println("Enter Invoice");
					System.out.println("Enter the weight: ");
					while(true)
					{
					String pr=br.readLine();
					boolean b1 = Validation.validatedata(pr,Validation.weightpattern);
					if(b1 == true)
					{
						try 
						{
							weight = Double.parseDouble(pr);
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
					
					System.out.println("Enter the distance: ");
					while(true)
					{
					String dis=br.readLine();
					
					boolean b1 = Validation.compareData(dis);
					if(b1 == true)
					{
						try 
						{	
							distance = Integer.parseInt(dis);
							break;
						}
						catch(Exception e)
						{
							System.out.println("Enter Again!!!");
						}
					}
					else
					{
						System.out.println("Wrong input. Enter again:");
					}
					}
					int id = (int) (Math.random()*1000);
					Invoice o = new Invoice(id, weight, distance);
					service.calculateInvoice(o);
					//					Order p = service.calculateOrder();
					System.out.println("Order ID: "+o.getId());
					System.out.println("Weight: "+o.getWeight());
					System.out.println("Distance: "+o.getDistance());
					System.out.println("Amount: "+o.getAmount());
					System.out.println("CGST: "+o.getCgst());			
					System.out.println("SGST: "+o.getSgst());
					double total= o.getAmount()+ o.getCgst()+ o.getSgst();
					System.out.println("Total Amount:"+ total);
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
