package com.capgemini.salesmanagement.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.service.SaleService;
import com.capgemini.salesmanagement.service.Validation;

public class Client {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SaleService service = new SaleService();
		String choice;
		while(true) {
			System.out.println("====================Menu=====================");
			System.out.println("1.Enter Product Details");
			System.out.println("2.Calculate Total and Display bill");
			System.out.println("3.Exit");
			System.out.println("=============================================");
			choice = br.readLine();
			
			switch(choice)
			{
			case "1": int prodCode,qty,prodPrice,salesId;String prodCate,prodName;float ltotal;
						LocalDate date;
						System.out.println("Enter Product Code");
						while(true)
						{
							String pc = br.readLine();
							boolean b1 = Validation.validatedata(pc, Validation.productcodepattern);
							if(b1 == true)
							{
								prodCode = Integer.parseInt(pc);
								break;
							}
							else
							{
								System.out.println("Please Enter a Valid Product Code.");
							}
							
						}
						System.out.println("Enter Quantity");
						while(true)
						{
							String qty1 = br.readLine();
							boolean b1 = Validation.validatedata(qty1, Validation.quantitypattern);
							if(b1 == true)
							{
								qty = Integer.parseInt(qty1);
								break;
							}
							else
							{
								System.out.println("Please Enter a Valid ProductQuantity.");
							}
							
						}
						System.out.println("Enter Category");
						while(true)
						{
							String cate = br.readLine();
							boolean b1 = Validation.validateCategory(cate);
							if(b1 == true)
							{
								prodCate = cate;
								break;
							}
							else
							{
								System.out.println("Please Enter a Valid ProductCategory.");
							}
							
						}
						System.out.println("Enter Product Name");
						while(true)
						{
							if(prodCate.equals(Validation.categorypattern1))
							{
								String subcate = br.readLine();
								boolean b1 = Validation.validateSubCategory1(subcate);
								if(b1 == true)
								{
									prodName = subcate;
									break;
								}
								else
								{
									System.out.println("Please Enter a Valid ProductName.");
								}
							}
							else
							{
								String subcate = br.readLine();
								boolean b1 = Validation.validateSubCategory2(subcate);
								if(b1 == true)
								{
									prodName = subcate;
									break;
								}
								else
								{
									System.out.println("Please Enter a Valid ProductName.");
								}
							}
						}
						System.out.println("Enter Product Price");
						while(true)
						{
							String pp = br.readLine();
							boolean b1 = Validation.validatedata(pp, Validation.productprice);
							if(b1 == true)
							{
								prodPrice = Integer.parseInt(pp);
								break;
							}
							else
							{
								System.out.println("Please Enter a Valid Product Price.");
							}
							
						}
						
						ltotal = qty*prodPrice;
						salesId = (int)(Math.random()*1000);
						date = LocalDate.now();
						Sale sa = new Sale(salesId, prodCode, prodCate, date, qty, ltotal, prodPrice, prodName);
						System.out.println(sa);
						break;
						
						
						
			
						
						
						
						
						
						
						
						
						
						
						
						
						
						
			}
		}
	}

}
