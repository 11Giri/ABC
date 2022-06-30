package com.abc;

import java.util.Arrays;

public class relational {
	public static void main(String[] args) {
		
	
	// Q4. Write a Java program to find the duplicate values of an array of String
	// values
//	String[] names = {"giriraj","shivakumar","Ganga", "Ganga","gita", "devi"};
//
//
//for(
//	int i = 0;i<names.length-1;i++){
//	for(int j=i+1;j<names.length;j++) {
//	if ((names[i]==names[j]) && (i !=j)){
//		System.out.println("dublicatenames is "+names[j]);
//	}
//}
		int [] array_num= {50,77,12,54,-11};
		System.out.println("original array: "+Arrays.toString(array_num));
		System.out.println("result:"+test(array_num));
		
	}
	public static boolean test( int[] numbers) {
		for(int number:numbers) {
			if(number==0|| number==-1) {
				return false;
			}
		}
			
				return true;
		}
	}





