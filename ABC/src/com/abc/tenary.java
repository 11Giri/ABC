package com.abc;

import java.util.Arrays;
import java.util.Scanner;

public class tenary {
	public static void main(String[] args) {
		int a = 10, b = 20, ch;
		System.out.println("Enter user choice...");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("sum" + (a + b));
		case 2:
			System.out.println("sub" + (a - b));
		case 3:
			System.out.println("multi" + (a * b));
		case 4:
			System.out.println("Div" + (a / b));
			break;
		default:
			System.out.println("Envalid choice");
		}
	}
}
