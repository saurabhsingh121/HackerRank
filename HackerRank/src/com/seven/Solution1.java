package com.seven;

import java.util.Scanner;
//Alternate for ArrayList reversal
public class Solution1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    int[] arr = new int[n];
		if(n >= 1 && n <= 1000){
		for(int i=0; i < n; i++){
	        int temp = scan.nextInt();
	        if (temp >=1 && temp <= 10000){
	        arr[i] = temp;
	        }
	        }
	    }
		for(int i=n-1; i >= 0; i--){
	        System.out.print(arr[i]+" ");
	        }
	    }
}
