package com.Inheritance;

class Vehicle {
	String make;
	String model;
	int year;
	public Vehicle(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void displayInfo() {
		System.out.println(make+" "+model+" "+year);
	}
}

 class Car extends Vehicle{
	int numberOfDoors;
	public Car(String make,String model,int year,int numberOfDoors) {
		super(make,model,year);
		this.numberOfDoors=numberOfDoors;
	}
	public void displayCarInfo() {
		displayInfo();
		System.out.println("no of doors:"+numberOfDoors);
	}
}

 class Truck extends Vehicle{
	double cargoCapacity;
	public Truck(String make,String model,int year,double cargoCapacity) {
		super(make,model,year);
		this.cargoCapacity=cargoCapacity;
	}
	public void displayTruckInfo() {
		displayInfo();
		System.out.println("Cargo Capacity:"+cargoCapacity);
	}
}

 class MotorCycle extends Vehicle{
	boolean hasSideCar;
	public MotorCycle(String make,String model,int year,boolean hasSideCar) {
		super(make,model,year);
		this.hasSideCar=hasSideCar;
	}
	public void displayMotorCycleInfo() {
		displayInfo();
		System.out.println("Has Sidecar: " + (hasSideCar ? "true" : "false"));
	}
}

public class Task1 {
	public static void main(String[] args) {
		Car car=new Car("Toyota","corolla",2022,4);
		Truck truck = new Truck("Ford","F-150",2021,1000);
		MotorCycle motorcycle=new MotorCycle("Harley-David","Street Glide",2023,true);
		car.displayCarInfo();
		System.out.println();
		
		truck.displayTruckInfo();
		System.out.println();
		
		motorcycle.displayMotorCycleInfo();
	}
	

}
