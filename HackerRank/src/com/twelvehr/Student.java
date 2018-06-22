package com.twelvehr;

public class Student extends Person{
	private int[] testeScores;
	Student(String firstName, String lastName, int IdNumber, int[] testScores){
		super(firstName, lastName, IdNumber);
		this.testeScores = testScores;
	}
	
	public char calculate(){
		int result = 0;
		int average = 0;
		for (int i = 0; i < this.testeScores.length; i++) {
			result += this.testeScores[i];
		}
		average = result / testeScores.length;
		if(average >= 90 && average <= 100)
			return 'O';
		else if (average >= 80 && average < 90)
			return 'E';
		else if (average >= 70 && average < 80)
			return 'A';
		else if (average >= 55 && average < 70)
			return 'P';
		else if (average >= 40 && average < 55)
			return 'D';
		else if (average < 40)
			return 'T';
		return 0;
	}
}
