package com.raj;

import java.util.Scanner;

public abstract class Bank {
	
	
	public String Name="myBank";
	public String IFSC="myBank123";
	
	public void bankDetail() {
		System.out.println("Bamk_name:"+Name+" "+"Bank_IFSC code"+IFSC);
	}
		
	abstract void Deposite();
	abstract void Withdraw();
	abstract void checkBal();

	protected abstract void Withfraw(int ch);

	public void Deposite(int ch) {
		// TODO Auto-generated method stub
		
	}

}
	abstract class bankService{
private double bal=5000;
private int pwd;
public double money;
	
public void Deposite(double money) {
	System.out.println("Enter Password");
	Scanner s=new Scanner(System.in);
	pwd=s.nextInt();
	if(pwd==123) {
	
		bal=bal+money;
		System.out.println("Deposited money: "+money);
		System.out.println("Total Balance:"+ bal);
		
	}
	else 
	{
		System.out.println("Incorret Password...");
	}


}
public void Withfraw(double money) {
	System.out.println("Enter password:");
	Scanner s=new Scanner(System.in);
	pwd=s.nextInt();
	if (pwd==123) {

bal=bal-money;
System.out.println("withdraw money:"+money);
System.out.println("Total Balance:"+bal);

}
else 
{
	System.out.println("Encorrect Password...");
}

}

public void checkBal() {
System.out.println("Enter Password");
Scanner s= new Scanner(System.in);
pwd=s.nextInt();
if (pwd==123) {
	System.out.println("Total Balance:"+bal);
}
else {
	System.out.println("encorrect Password:");
}
}
}

class Customer {
	public static void main(String[] args) {
		Bank b = new Bank ();
		int ch;
		System.out.println("1.Deposite");
		System.out.println("2. withdraw:");
		System.out.println("3.checkBalance");
		System.out.println("enter your choice:");
		Scanner s2 = new Scanner(System.in);
		ch = s2.nextInt();
		switch (ch) {
		case 1:
			b.Deposite(ch);
			break;
		case 2:
			b.Withfraw(ch);
			break;
		case 3:
			b.checkBal();
			break;
		default:
			System.out.println("Invalid choice");
		}

	}
}