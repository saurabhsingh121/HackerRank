package com.twelve;

public class Volunteer extends Employee{
	int hours;
	Volunteer(String name){
		super(name);
	}
	void setHours(int hours){
        this.hours = hours; 
    }
    int getHours(){
        return hours; 
    }
    @Override
    void print(){ 
        System.out.println("Volunteer Name: " + this.getName() 
            + "\nHours: " + this.getHours());    
    }
}
