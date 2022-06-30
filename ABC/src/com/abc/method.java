package com.abc;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Write a program to take     age from customer as an user input , then based on the below conditions display the message-
//		If age is less than 18 - " Not allow for movie"
//		If age is greater than 18 and less than 28- " Allow for fighting movie"
//		If age is greater than 28- " Allow all movies"
int age;
System.out.println("Enter the age :");
Scanner sc= new Scanner(System.in);
age = sc.nextInt();
if (age<18) {
System.out.println("Not allow for movie");
	
	}else if (age>18 && age<28) {
System.out.println(" Allow for fighting movies");

	} else if  (age >28) {
System.out.println("Allow all movies");
	}else {
System.out.println("not  a valid choice");
		//3. Write a program to store 5 user inputs in the array (where 55 is a must )and then display the total size of the array.
		//After that check if the array have any value 55 or not? If 55 is there then you need to remove it and then again display 
				//the size of the array. Else you need to print- "No 55 value found"
	
		
}
	}
}
