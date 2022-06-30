package com.abc;

import java.util.Scanner;

public class stringclass {
public static void main(String[] args) {
	 int purchase_amt;
	 System.out.println("Enter puychase amount");
	 Scanner sc= new Scanner(System.in);
			 purchase_amt=sc.nextInt();
	 switch (purchase_amt) {
		 
	  case 1:
		 System.out.println("purchase of coke");
		 break;
	 case 2:
		 System.out.println("purchse a pespi");
		 break;
	 case 3:
		 System.out.println("purchase dite drink");
		 break;
	 case 4:
		 System.out.println("purchase of water");
		 break;
		 default:
			 System.out.println("not valid purchase");
}
}
}

