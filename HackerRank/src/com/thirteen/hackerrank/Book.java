package com.thirteen.hackerrank;

public abstract class Book{
	String title;
	String author;
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	public  abstract void display();
}
