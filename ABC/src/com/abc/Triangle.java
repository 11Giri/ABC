package com.abc;

public class Triangle extends Shape {

	Triangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	public double area () {
		System.out.println("Area of Triangle");
		return( side1*side2)/2; 
	}

}
