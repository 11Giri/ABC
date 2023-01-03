package com.abc;

public class Circle extends Shape {

	Circle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	public double area() {
		System.out.println("Area of a circle");
		return 3.14*side2*side2;
	} 
}
