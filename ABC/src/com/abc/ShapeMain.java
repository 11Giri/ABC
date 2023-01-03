package com.abc;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s=new Shape(5,5);
Rectangle r=new Rectangle(2,9);
Triangle t=new Triangle(5,7);
Circle c= new Circle (3.14,7);
Shape result;
result =r;
System.out.println("Area is"+ result.area());
result =s;
System.out.println("Area is "+result.area());
result =t;
System.out.println("Area is "+ result.area());
result=c;
System.out.println("Area is "+result.area());
	}

}
