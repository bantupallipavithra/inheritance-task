package com.Inheritance;

	class Animal1{
		public void display() {
			System.out.println("This is an animal");
		}
	}
	
	class Dog extends Animal1{
		
	}  
	
public class Task5 {
public static void main(String[] args) {
	Dog dog=new Dog();
	dog.display();
}
}
