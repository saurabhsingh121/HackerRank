package com.five;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 2 & n <= 20){
        	int i = 1;
        	while(i <= 10){
        		int result = n * i;
        		System.out.println(n+" x "+i+" = "+ result);
        		i++;
        	}
        }
	}
}
