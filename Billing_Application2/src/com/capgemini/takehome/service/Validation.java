package com.capgemini.takehome.service;

public interface Validation {
	String productcodepattern="[1-9][0-9][0-9][0-9]";
	String quantitypattern="[1-9][0-9]*";
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}
	
}
