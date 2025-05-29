package com.Inheritance;

class Vehicle1{
	public void run() {
		System.out.println("Vehicle is running");
	}
}

class Car1 extends Vehicle1{
	public void speed() {
		System.out.println("car is moving at 80km/h");
	}
}
public class Task6 {
public static void main(String[] args) {
	Car1 car=new Car1();
	car.run();
	car.speed();
}
}
