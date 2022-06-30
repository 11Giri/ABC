package com.abc;

import java.util.Arrays;
import java.util.Scanner;

public class tenary {
public static void main(String[] args) {
	// TODO Auto-generated method stub
//int  a[]= {10,30,50,70,90};
int a[][]= new int[2][2];
System.out.println("Enter arry element");
Scanner sc=new Scanner(System.in);

for (int i= 0;i<2;i++) {
	for (int j= 0;i<2;j++)
	{
	a[i][j]=sc.nextInt();
}
}
System.out.println(" matrix arry element");
for (int i=0;i<2;i++) 

{
	for (int j= 0;i<2;j++)
	{
	System.out.println(a[i][j] +"");
}

}
}
}
