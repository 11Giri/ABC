package com.abc;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
Scanner obj = new Scanner(System.in);

System.out.println("enert first number");
 double num1 =obj.nextDouble();
 System.out.println("enter secound number");
 double num2 =obj.nextDouble();
 System.out.println("type A->addition,  S -> substraction, M ->multification, D-> division");
 String operation = obj.next();
 if (operation.equals("A")) {
	 System.out.println(addition (num1,num2));
 }else if (operation.equals("S")) {
	 
	 
	 System.out.println(substraction(num1,num2));
 }else if(operation.equals("M")) {
	 System.out.println(multification(num1,num2));
 }else if (operation.equals("D")) {
	 System.out.println(division(num1,num2));
 }else {
	 System.out.println("invalid input");
 }
	}
	
	 
 public static double addition(double num1,double num2) {
	 return num1 +num2;
 }
 public static double substraction (double num1, double num2) {
	 return num1-num2;
	 
 }
 public static double multification(double num1, double num2) {
	 return num1*num2;
	}
 public static double division (double num1, double num2) {
	 return num1/num2;
}
	}