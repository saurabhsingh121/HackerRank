package com.nineteen.intrface;

public class Triangle implements Polygon{
	private static int sides = 3;
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public int getNumberOfSide(){
		return this.sides;
	}
	public double getPerimeter(){
		return this.side1 + this.side2 + this.side3;
	}
}
