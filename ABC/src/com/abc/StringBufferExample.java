package com.abc;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
	
StringBuffer stringBuffer=new StringBuffer();
StringBuffer stringBuffer1=new StringBuffer(50);
StringBuffer str=new StringBuffer("zorba softed");
stringBuffer1.append("Text ");
stringBuffer1.append("Test1 ");
stringBuffer1.append("Test2 ");

System.out.println(stringBuffer1.toString());
str.append(" org ");
System.out.println(str.toString());
System.out.println(str.reverse());
}
}
