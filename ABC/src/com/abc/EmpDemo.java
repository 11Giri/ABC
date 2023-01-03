package com.abc;

import java.util.Scanner;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Employee emps[]=new Employee[3];

for(int i=0;i<emps.length;i++) {
	System.out.println("enter id");
	int id=sc.nextInt();
	System.out.println("Enter name");
	String name=sc.next();
	System.out.println("Enter the adress");
	String address=sc.next();
	System.out.println("Enter the salary");
	double salary=sc.nextDouble();
	System.out.println("Enter the department");
	String department=sc.next();
	Employee employee=new Employee (id,name,address,salary,department);
	emps[i]=employee;
	
}
System.out.println("Lenth of array"+emps.length);
for(Employee emp:emps) {
	System.out.println(emp.id+""+emp.name+" "+emp.address+" "+emp.salary+" "+emp.department);
	boolean value =emp.eligibleForPromotion();
	if(value==true) {
		System.out.println("update salary is:"+emp.updateSalary());
	}
}
	}

}
 