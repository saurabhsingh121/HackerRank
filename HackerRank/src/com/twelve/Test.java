package com.twelve;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee("Saurabh");
		emp.print();
		emp.setSalary(35000);
		emp.print();
		
		Volunteer vol = new Volunteer("Jansatta");
		vol.setHours(45);
		vol.print();

	}

}
