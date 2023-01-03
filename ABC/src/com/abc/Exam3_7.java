package com.abc;

import java.util.Scanner;

public class Exam3_7 {
	public static void main(String[] args) {
//		17.Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
//			Basic Salary <= 10000 : HRA = 20%, DA = 80%
//			Basic Salary <= 20000 : HRA = 25%, DA = 90%
//			Basic Salary > 20000 : HRA = 30%, DA = 95%

	 
	System.out.println("ENter the base pay");
	 
	double HRA = 0,DA = 0,Gross_salary=0;
	Scanner sc=new Scanner(System.in); 
	 Gross_salary=sc.nextDouble();
	double basepay = 20000;
	
	Gross_salary=(basepay+HRA+DA);
	Gross_salary=sc.nextDouble();
	
	 if (basepay<=10000 ) {
		 HRA =(basepay*20/100) ;
		 DA=(basepay*80/100) ;
		 Gross_salary=basepay+HRA+DA;
		 System.out.println(Gross_salary);
	 }
	 else if (basepay<=20000) {
		 HRA=(basepay*25/100);
		 DA=(basepay*90/100);
		 Gross_salary=basepay+HRA+DA;
	 }

	else  if (basepay> 20000 ) {
		HRA=(basepay*30/100 );
	 DA=(basepay*95/100) ;
	 Gross_salary =basepay+HRA+DA;
	 System.out.println(Gross_salary);
	}
	else {
		System.out.println("not valid salary");
	}
	}
}
