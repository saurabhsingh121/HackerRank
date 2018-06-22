package com.sixteen;


import java.util.Scanner;


public class Solution2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int intValue;
		try {
			System.out.println(intValue = Integer.parseInt(S));
		} catch (NumberFormatException e) {
			System.out.println("Bad String"+e);
		}catch (IllegalArgumentException e) {
			System.out.println("Bad String"+e);
		}finally{
			scan.close();
		}
	}
}
