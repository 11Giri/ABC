package com.abc;

import java.util.Scanner;

public class simplefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//user type-5
		Scanner sc =new Scanner(System.in);
		System.out.println("How many data you want to insert");
		int count = sc.nextInt();
		int[] number =new int[count];
		for (int i=0;i<count;i++) {
			System.out.println("Enter your number");
			int num= sc.nextInt();
			number[i]=num;
			
		}
		System.out.println("the data stored in array:");
		for( int i= 0;i<number.length;i++) {
			System.out.println(number[i]);
		}
	}
}
		
	





