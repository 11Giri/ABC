package com.abc;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,ch;
System.out.println("enter any two number:");
Scanner sc =new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter your choice:");
ch = sc.nextInt();
	
switch (ch)
{
	case 1 : c=a+b;
	System.out.println("addition"+c);
	break;
	case 2: c=a-b;
	System.out.println("subtraction"+c);
	break;
	case 3 : c=a*b;
	System.out.println("multification"+c);
	break;
    case 4 : c=a/b;
     System.out.println("division"+c);
      break;
       case 5: c=a%b;
      System.out.println("reminder"+c);
      break;

     default:
             System.out.println("invalid choice");
 }
	}
}
	