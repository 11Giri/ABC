package com.supe;

public class ClassA {
	int A=10;
	

}
class B extends ClassA {
	int a=20;
	void show() {
		System.out.println(a);
	}
	
}
 class Test{
	public static void main(String[] args) {
		B r=new B();
		r.show();
		
	}
}