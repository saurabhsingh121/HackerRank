package com.twelve;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
	protected String name;
	private int salary;
	public Employee(String name) {
		this.name = name;
	} 
	
	String getName(){
		return name;
	}
	
	void setSalary(int salary){
		this.salary = salary;
	}
	int getSalary(){
		return salary;
	}
	void print(){
		if(this.salary == 0){
            System.err.println("Error: No salary set for " + this.name 
                + "; please set salary and try again.\n");
        }else {
			NumberFormat salaryFormat = NumberFormat.getCurrencyInstance(Locale.US);
			System.out.println("Employee Name: " + this.name 
	                + "\nSalary: " + salaryFormat.format(this.salary) + "\n");
		}
	}
}
