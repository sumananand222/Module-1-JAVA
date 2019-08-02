package com.capgemini.salesmanagement.service;

public interface Validation {
	String productcodepattern="[1-9][0-9][0-9][0-9]";
	String quantitypattern="[1-4]";
	String categorypattern1="Electronics";
	String categorypattern2="Toys";
	String categorypattern1sub1="TV";
	String categorypattern1sub2="Smart Phone";
	String categorypattern1sub3="Video Games";
	String categorypattern2sub1="Soft Toy";
	String categorypattern2sub2="Telescope";
	String categorypattern2sub3="Barbee Doll";
	String productprice="[2-9][0-9][0-9]*";
	
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}
	public static boolean validateCategory(String data)
	{
		return(data.matches(categorypattern1)||data.matches(categorypattern2));
	}
	public static boolean validateSubCategory1(String data)
	{
		return(data.matches(categorypattern1sub1)||data.matches(categorypattern1sub2)||data.matches(categorypattern1sub3));
	}
	public static boolean validateSubCategory2(String data)
	{
		return(data.matches(categorypattern2sub1)||data.matches(categorypattern2sub2)||data.matches(categorypattern2sub3));
	}

}

