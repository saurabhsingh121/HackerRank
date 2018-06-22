package com.seventeen;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
	while (t-- > 0) {
		int n = scan.nextInt();
		int p = scan.nextInt();
		Calculator myCalculator = new Calculator();
		try {
			int ans = myCalculator.power(n, p);
			System.out.println(ans);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	scan.close();
}
}
