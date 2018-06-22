package com.nineteen.intrface;

public class Rectangle implements Polygon{
	private static int numberOfsides = 4;
	private double side1;
	private double side2;
	
	public Rectangle(double side1, double side2){
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public int getNumberOfSide(){
		return this.numberOfsides;
	}
	
	public double getPerimeter(){
		return 2* (this.side1 + this.side2);
	}
}
