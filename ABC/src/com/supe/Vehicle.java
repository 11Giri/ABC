package com.supe;

public class Vehicle {
	void engine() {
		System.out.println("I have one engine");
	}
	void wheels() {
		System.out.println("I have wheels");
	}
}
class Bike extends Vehicle{
	void wheels() {
		System.out.println("I have two wheels");
	}

}
class Car extends Vehicle{
	void wheels() {
		System.out.println("I have 4 wheels");
	}

}
class Auto extends Vehicle{
	void wheels() {
		System.out.println("I have Three wheels");
	}

}
