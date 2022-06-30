package com.abc;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//char[] cha ={'a','e','i','o','u'};
Scanner sc=new Scanner(System.in);
//System.out.println("enter the input character");
//int vowel=sc.nextInt();
//switch(vowel) {
//case 1:
//	System.out.println('a' +" is vowel");
//	break;
//case 2:
//	System.out.println('e'+" is vowel");
//	break;
//case 3:
//	System.out.println('i'+" is vowel");
//	break;
//
//	
//case 4:
//	System.out.println('o'+" is vowel");
//	break;
//case 5:
//	System.out.println('u'+" is vowel");
//	
//break;
//default:
//	System.out.println( "is consonant");
//
//}q 8 write a program to take an input from 1 to 7 and based on the
//the input display the days of a week
System.out.println("Enter the days");

int weeks=sc.nextInt();
switch(weeks) {
case 1:
	System.out.println("this is a sunday");
	break;
case 2:
	System.out.println("this is a monday");
	break;
case 3:
	System.out.println("this is a Tustday");
	break;
case 4:
	System.out.println("this is a wendesday");
	break;
case 5:
	System.out.println("this is a Thustday");
	break;
case 6:
	System.out.println("this is a Friday");
	break;
case 7:
	System.out.println("this is a sautarday");
	break;
default:
	System.out.println("this is not valid day");
	
}
}
}