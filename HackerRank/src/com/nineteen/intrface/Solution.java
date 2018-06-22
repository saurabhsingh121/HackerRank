package com.nineteen.intrface;

public class Solution {
	public static void print(Polygon p){
		System.out.println("A " + p.getClass().getSimpleName()+ " has "+ p.getNumberOfSide()+ " sides.");
		System.out.println("The perimeter of this shape is: " + p.getPerimeter());
	}
	
	public static void main(String[] args) {
		Polygon triangle = new Triangle(1, 2, 3);
		print(triangle);
		Polygon rectangle = new Rectangle(2, 4);
		print(rectangle);
		Polygon square = new Square(6);
		print(square);
	}
}
