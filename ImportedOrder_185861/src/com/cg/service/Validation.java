package com.cg.service;

public interface Validation {
	String dollarpattern1="[0-9]*";
	String dollarpattern2="[0-9]*[/.][0-9]*";
	String quantitypattern="[1-9][0-9]*";
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}
	public static boolean compareData(String data) {
		return (data.matches(dollarpattern1)||data.matches(dollarpattern2));
	}
}
/*
 * 
 [0-9][0-9][/.][0-9]
 
 
 
 * */
 