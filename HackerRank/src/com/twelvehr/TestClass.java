package com.twelvehr;

import java.util.Scanner;

public class TestClass {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String firstName = scan.next();
	String lastName = scan.next();
	int id = scan.nextInt();
	int numScore = scan.nextInt();
	int[] testScores = new int[numScore];
	for (int i = 0; i < numScore; i++) {
		testScores[i] = scan.nextInt();
		
	}
	scan.close();
	
	Student s = new Student(firstName, lastName, id, testScores);
	s.printPerson();
	System.out.println("Grade: "+ s.calculate());
}
}
