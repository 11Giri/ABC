package com.abc;
 
public class Rectangle extends Shape {

	Rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	public double area() {
		System.out.println("Area of a Rectangle");
		return side1*side2; 
	}

}
