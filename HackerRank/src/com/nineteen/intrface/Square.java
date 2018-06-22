package com.nineteen.intrface;

public class Square extends Rectangle implements Polygon{
	//No need of implementing abstract methods of interface when it was already implemented by superclass
	public Square(double side){
		super(side, side);
	}
}
