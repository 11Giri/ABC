package com.abc;

public class ExceptionOfHandal {
public static void main(String[] args) {
	

/*String str= null;
System.out.println(str.toLowerCase());
str=str+"Test";
System.out.println(str);*/
//	int i=0;
//	int a=0;
//	int b=5;
//	a=10;
//	try {
//		
//	
//	i= a/b;
//	
//	} catch(Exception e) {
//		System.err.println("Exception handled!!!");
//	}finally{
//	System.out.println("finally block!!");
//	System.out.println("Division out put ::"+i);
//	i= a*b;
//	System.out.println("Multiplication output::"+i);

	decreaseNumberbyOne(2);
	}
	public static void decreaseNumberbyOne(int num){	
		if(num >= 0){
			decreaseNumberbyOne(num -1);
		}
		System.out.println("Number:"+num);
	}
}



