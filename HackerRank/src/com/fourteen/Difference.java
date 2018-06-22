package com.fourteen;


public class Difference {
	private int[] elements;
	public int maximumDifference;
	public Difference(int[] elements){
		this.elements = elements;
	}
	public void computeDifference(){
		int temp = 0;
		for (int i = 0; i < this.elements.length; i++) {
			for (int j = i+1; j < this.elements.length; j++) {
				temp = this.elements[i] - this.elements[j];
				//System.out.println(temp);
				//System.out.println(maximumDifference);
				if(Math.abs(temp) > maximumDifference)
					maximumDifference = Math.abs(temp);
			}
		}
	}
}
