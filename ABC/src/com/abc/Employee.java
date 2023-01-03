package com.abc;

public class Employee {
//	1. Create Employee class with id, name, address, salary and department attributes. 
//	 
//	2. Employee class having three methods named  
//	getEmployeeDetails() -which displays all the details for employee 
//	eligibleforPromotion() - which checks , if the salary of the employee is less than 1000 USD ,  
//	then they are eligible for promotion and is calls the updateSalary() for updating new salary 
//	updateSalary() - this method update the existing salary by 20% and return updated salary 
//	 
//	3. Create 3 employee object on the Employee class by taking all details from console. 
//	 
//	4. Store all the employee objects inside an array and print the lenght 
//	 
//	5. get the details for all employee 
//	 
//	6. check and print the name of the employee who is eligible for promotionRam C Timilsina, [7/8/2022 10:07 PM]
	
int id;
String name;
String address;
double salary;
String department;
public Employee(int id, String name, String address, double salary, String department) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.salary = salary;
	this.department = department;
}
public Employee() {
	System.out.println("Employee class constructor invoke");
	
}
public Employee(int id) {
	System.out.println("Employee class parameterized constructor");
}
public Employee (int id , String name,double salary ,String address,String department) {
	System.out.println("four parameteruzed constructor");
}
public void display() {
	System.out.println(id+" "+name+" "+salary+" "+address+" "+department );
}
public boolean eligibleForPromotion() {
	if(salary<1000) {
		System.out.println(name+" "+"Eligible for promotion");
		return true;
		
	}
	else {
		System.out.println(name+" "+"Not eligible for promotion");
		return false;
	}
}
public double updateSalary() {
	double updateSalary=salary+(salary*20/100);
	return updateSalary;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}
/**
 * @return the department
 */
public String getDepartment() {
	return department;
}
/**
 * @param department the department to set
 */
public void setDepartment(String department) {
	this.department = department;
}
}