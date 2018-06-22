package com.thirteen.hackerrank;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String title = scan.nextLine();
	String author = scan.nextLine();
	int price = scan.nextInt();
	scan.close();
	
	Book book = new MyBook(title, author, price);
	book.display();
}
}
