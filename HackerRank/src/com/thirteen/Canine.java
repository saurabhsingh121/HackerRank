package com.thirteen;

abstract class Canine {
	String name;
	String color;
	String gender;
	int age;
	
	Canine(String name, String color, int age, char mF){
		this.name = name;
		this.color = color;
		this.age = age;
		this.gender = (mF == 'M') ? "Male" : "Female";
	}
	 /** Abstract method declaration
	    *   @return Implementations should return a string describing the breed **/
	abstract String getBreed();
	
	void printInfo(){
		System.out.println(name + " is "+ ((age%10 ==8 )? "an ": "a ") + age + " year old "
				+ gender + getBreed() + " with a " + color + " coat." );
	}
}
