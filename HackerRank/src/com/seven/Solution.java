package com.seven;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	if(n >= 1 && n <= 1000){
	int[] arr = new int[n];
	int[] revArr = new int[n];
	for(int i=0, j=n-1; i < n && j >= 0; i++, j--){
        arr[i] = scan.nextInt();
        revArr[j] = arr[i];
        if(revArr[i] !=0 ){
        System.out.print(revArr[i]+" ");
        }
    }
	String str = Arrays.toString(arr);
	str.replaceAll("(\\d+),.*", "$1");
	System.out.println(str);
	System.out.println(Arrays.toString(revArr));
	}
}
}
