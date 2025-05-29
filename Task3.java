package com.Inheritance;

 abstract class Shape {
    public abstract double calculateArea(); 
    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}

 class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayCircleInfo() {
        System.out.println("Circle Radius: " + radius);
        displayArea();
    }
}

 class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double calculateArea() {
        return length * width;
    }

    public void displayRectangleInfo() {
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        displayArea();
    }
}

 class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public void displayTriangleInfo() {
        System.out.println("Triangle Base: " + base);
        System.out.println("Triangle Height: " + height);
        displayArea();
    }
}


public class Task3 {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5.0);
	        Rectangle rectangle = new Rectangle(4.0, 6.0);
	        Triangle triangle = new Triangle(3.0, 7.0);

	        System.out.println("---- Circle ----");
	        circle.displayCircleInfo();

	        System.out.println("\n---- Rectangle ----");
	        rectangle.displayRectangleInfo();

	        System.out.println("\n---- Triangle ----");
	        triangle.displayTriangleInfo();
	    }
	}

