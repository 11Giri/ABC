package com.abc;

import java.util.Scanner;

public class sannER {
	static int id;
	 static String name;
	 static double salary;
	 static boolean promotioneligiblity;
	 static char grade;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		id = sc.nextInt();
		System.out.println(id);
		System.out.println("Enter name");
		name = sc.next();
		
		System.out.println(name);
		System.out.println("Enter the salary");
		salary = sc.nextDouble();
		System.out.println(salary);
		System.out.println("Promotion eligibilty");
		promotioneligiblity = sc.nextBoolean();
		System.out.println("yes or no");
		System.out.println("enter the grade");
grade = sc.next().charAt(0);
System.out.println(grade);
System.out.println(id+ " "+ name+" "+salary+" "+promotioneligiblity+" "+grade);
	}

}
