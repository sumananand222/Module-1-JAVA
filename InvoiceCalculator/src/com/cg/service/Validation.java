package com.cg.service;

public interface Validation {
	String weightpattern="[0-9]*[/.][0-9]*";
	String distancepattern1="[1-9][0-9]";
	String distancepattern2="[1-9]";
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}
	public static boolean compareData(String data) {
		return (data.matches(distancepattern1)||data.matches(distancepattern2));
	}
}
