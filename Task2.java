package com.Inheritance;

class Employee{
	public String name;
	public double baseSalary;
	public Employee(String name,double baseSalary){
		this.name=name;
		this.baseSalary=baseSalary;
	}
	public double  calculateAnnualSalary() {
		return baseSalary*12;
	}
	public void displayEmployeeInfo() {
		System.out.println("Name:"+name);
		System.out.println("Base Salary:"+baseSalary);
		System.out.println("Annual Salary:"+calculateAnnualSalary());
	}
}

class Manager extends Employee{
	public double bonus;
	public int numberOfEmployeesManaged;
	public Manager(String name,double baseSalary,double bonus,int numberOfEmployeesManaged) {
		super(name,baseSalary);
		this.bonus=bonus;
		this.numberOfEmployeesManaged=numberOfEmployeesManaged;
	}
	public double calculateManagerSalary() {
		return calculateAnnualSalary()+bonus;
	}
	public void dispayManagerInfo() {
		displayEmployeeInfo();
		System.out.println("Bonus:"+bonus);
		System.out.println("Employees Managed:"+numberOfEmployeesManaged);
		System.out.println("Total Annual Salary:"+calculateManagerSalary());
	}
}

class Engineer extends Employee{
	int projectCount;
	public Engineer(String name,double baseSalary,int projectCount) {
		super(name,baseSalary);
		this.projectCount=projectCount;
	}
	public double calculateEngineerSalary() {
		double projectBonus=projectCount*1000;
		return calculateAnnualSalary()+projectBonus;
	}
	public void displayEngineerInfo() {
		displayEmployeeInfo();
		System.out.println("projects:"+projectCount);
		System.out.println("total salary:"+calculateEngineerSalary());
	}
}

class SalesPerson extends Employee{
	double commissionRate;
	double totalSales;
	public SalesPerson(String name,double baseSalary,double commissionRate,double totalSales) {
		super(name,baseSalary);
		this.commissionRate=commissionRate;
		this.totalSales=totalSales;
	}

	public double calculateSalespersonSalary() {
		double commission =totalSales*commissionRate;
		return calculateAnnualSalary()+commission;
	}
	public void displaySalesPersonInfo() {
		displayEmployeeInfo();
		System.out.println("Total Sales:"+totalSales);
		System.out.println("Commission Rate:"+(commissionRate*100));
		System.out.println("Total Annual Salary:"+ calculateSalespersonSalary());
	}
}
public class Task2 {
	public static void main(String[] args) {
		Manager manager=new Manager("Alice",5000,10000,5);
		Engineer engineer=new Engineer("Bob",4000,3);
		SalesPerson salesperson=new SalesPerson("charlie",3000,0.10,50000);
		
		System.out.println("-----Manager------");
		manager.dispayManagerInfo();
		
		System.out.println("\n---Engineer---");
		engineer.displayEngineerInfo();
		
		System.out.println("\n---Salesperson---");
		salesperson. displaySalesPersonInfo();
	}

}
