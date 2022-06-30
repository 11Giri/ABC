package com.abc;

import java.util.Scanner;

public class switchcase {
public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the month");
	int month = sc.nextInt();
	switch(month) {
	
	
	
		case 1: 
		System.out.println("month is janurary");
		break;
		case 2:
		System.out.println("month is feburary");
		break;
		case 3: 
		System.out.println("month is march");
		break;
		case 4: 
		System.out.println("month is aprial");
		break;
		case 5: 
		System.out.println("month is june");
		break;
		case 6: 
		System.out.println("month is july");
		break;
		default:
			System.out.println("not a valid month");
	}
	



}
}
