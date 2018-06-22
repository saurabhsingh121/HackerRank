package com;

import java.util.Scanner;

public class Solution1 {

	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int secInt = 0;
        double secDouble = 0.0;
        String secString = null;
        secInt = Integer.parseInt(scan.nextLine().trim());
        secDouble = Double.parseDouble(scan.nextLine().trim());
        secString = scan.nextLine();
        System.out.println(i + secInt);
        System.out.println(d + secDouble);
        System.out.println(s + " " + secString);
        scan.close();
}
}
