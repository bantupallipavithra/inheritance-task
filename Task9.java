package com.Inheritance;

class Computer{
	public void show() {
		System.out.println("Brand:Dell");
	}
}

class Laptop extends Computer{
	public void showModel() {
		System.out.println("Model:XPS 15");
	}
}
public class Task9 {
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.show();
		l.showModel();
	}

}
