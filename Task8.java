package com.Inheritance;

class Employee1{
	int salary=50000;
}

class Manager1 extends Employee1{
	int bonus=20000;
}
public class Task8 {
public static void main(String[] args) {
	Employee1 e=new Manager1();
	System.out.println("Base salary:"+e.salary);
	Manager1 m=(Manager1) e;
	System.out.println("Bonus:"+m.bonus);
	int totalSalary=m.salary+m.bonus;
	System.out.println("Total Salary:"+totalSalary);
	
}
}
