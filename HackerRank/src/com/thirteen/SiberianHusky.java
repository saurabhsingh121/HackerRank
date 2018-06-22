package com.thirteen;

class SiberianHusky extends Canine{
	
	public SiberianHusky(String name, String color, int age, char mF) {
		super(name, color, age, mF);
	}
	@Override
	String getBreed(){
		return "Siberian Husky";
	}
}
