package com.abc;

import java.util.Scanner;

public class Controlstatement {

	public static void main(String[] args) {
		
	//	13.Write a Java program to count total number of notes in given amount.

Scanner sc=new Scanner(System.in);
int Rs[]= {1000,500,100,50,20,10,5,2,1};
System.out.println(" enter the amount");
int amount=sc.nextInt();
int copy =amount;
int totalNotes=0,count=0;
System.out.println("Rs: ");
for(int i=0;i<9;i++) {
	count= amount/Rs[i];
	if(count!=0)
		System.out.println(Rs[i]+"  "+count+" " +Rs[i]*count);
	totalNotes= totalNotes+count;
	amount =amount%Rs[i];
	
}
System.out.println(".............");
System.out.println(" total "+ amount);
System.out.println("total number of notes"+ totalNotes);
}
}