package com.sixteen;

import java.util.LinkedList;

public class Solution {
	LinkedList<String> list;
	int[] intArray = new int[4];
	
	 Solution(){
		this.list = null;
	}
	 
	 Solution (String str){
		 this.list = new LinkedList<String>();
		 list.add(str);
	 }
	 
	 void exceptionDemo(int i, String str){
		try {
			 int myInt = intArray[i];
			 
			 
			 list.indexOf(str);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("The following index is out-of-bounds: " + e.getMessage());
		}catch (NullPointerException e) {
			System.err.println("Oh no! You tried to perform an operation on an object whose value is null!");
		}finally{
	            System.out.println("This is printing regardless of whether or not the program finishes executing.");
	        }
		 System.out.println("The program was able to continue execution!\n");
	 }
	 
	 public static void main(String[] args){
		 Solution sNullList = new Solution();
		 
		 sNullList.exceptionDemo(1, "x");
		 
		 
		 Solution sNotNullList = new Solution();
		 
		 sNotNullList.exceptionDemo(100, "x");
	 }
}
