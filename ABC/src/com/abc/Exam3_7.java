package com.abc;

import java.util.Scanner;

public class Exam3_7 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the voting machine"
				+"error code decoder.\n\n"
				+ "if your voting machine generates"
				+"an error code,\n"
				+"You can use this program to determine"
				+"the exact\ncause of the error.\n");
		System.out.println("Enter the error code");
		int err=sc.nextInt();
		String msg;
		switch(err) {
		case 1:	//if (err==1)
			msg="Voter marked more than one candidate.\n"+"Ballot rejected.";
			break;
		case 2: //else if (err==2)
			msg ="Box checked and write -in candidate"+"entered.\nBallot rejected.\n";
			break;
		case 3://else if(err==3)
			msg="Enter ballot was blank.\n"+"Ballot filled in according to"+"Select plan.";
			break;
		case 4://else if (err==4)
			msg="Nothing unuaual about the ballot.\n"+"vOTER RANDOMLY SELECTED FOR TAX AUDIT.";
			break;
		case 5://else if (err==5)
			msg="Voter filled in every box.\n"+"Ballot counted twice.";
			break;
		case 6: //else if(err==6)
			msg="Voter drooled in voting machine.\n"
			+"Beginning spin sysle.";
			break;
		case 7:	//else if (err==7)
			msg="Voter lied to pollster after voting.\n"
			+"voter's ballot changed"
					+"To match polling data";
		break;// else
		default:
			msg= "voter filled out ballot correctly.\n"+"Ballot discarded anyway.";
			break;
		}
		System.out.println(msg);
				
	
}
}