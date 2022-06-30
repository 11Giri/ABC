package com.abc;


public class qn1ans {
	 
	public static void main(String[] args) {
	//	Q6. Write  a Java program to reverse an array of integer values
//
//	int[]array1= {1,2,3,4,5};
//	int[]array2=new int[array1.length];
//	System.out.println("the original array");
//	for(int i=0;i<array1.length;i++) {
//		System.out.println(array1[i]);
//	}
//	System.out.println("reverse");
//	for(int j=array1.length-1;j>=0;j--) {
//		System.out.println(array1[j]);
//	}
//	
//	}Q7. Write a Java program to test the equality of two array of type String
boolean equalornot =true;
String []str1={"sagar","shiva"};
String []str2= {"sagar","shiva"};
String[]str3= {"shova","shiva"};

	if(str1.length==str2.length) {
		for(int i=0;i<str1.length;i++) {
		if (str1[i]!= str2[i])	{
		
	
System.out.println("two arrays areequal ");
		
		}
else {
	

System.out.println("two arrays are notequal ");
}
	
	}	

	}
	

}

}

