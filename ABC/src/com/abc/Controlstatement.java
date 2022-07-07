package com.abc;

public class Controlstatement {

	public static void main(String[] args) {
	//	6.Write a Java program to check whether a year is leap year or not.
		int year= 2000;
		if((year%400==0)||(year%4==0)&& (year%100!=0)) {
			System.out.println(year+ " is leap year");
				
			}
		else {
			System.out.println(year+"is not a leap year");
		}
		
}
}
