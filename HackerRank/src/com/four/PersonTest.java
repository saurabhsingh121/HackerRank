package com.four;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(15);
		p1.amIOld();
		for (int j = 0; j < 3; j++) {
			p1.yearPasses();
		}
		p1.amIOld();
		System.out.println();
    }



}
