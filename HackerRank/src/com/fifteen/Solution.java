package com.fifteen;

import java.util.Scanner;

public class Solution {
	public static Node insert(Node head, int data){
		head = new Node(data);
		System.out.println(head);
		return head;
	}
	
	public static void display(Node head){
		Node start = head;
		while (start != null) {
			System.out.println(start.data+ " ");
			start = start.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Node head = null;
		int N = scan.nextInt();
		
		while (N-- > 0) {
			int ele = scan.nextInt();
			head = insert(head, ele);
		}
		
	}
}
