package com.Inheritance;

class Person{
	public Person() {
		System.out.println("Person object created");
	}
}

class Student extends Person{
	public Student() {
		System.out.println("Student object created");
	}
}
public class Task7 {
	Student student=new Student();

}
