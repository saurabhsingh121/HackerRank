package com.thirteen.hackerrank;

public class MyBook extends Book{
		int price;
		public MyBook(String title, String author, int price){
			super(title, author);
			this.price = price;
		}
		@Override
		public void display(){
			System.out.println("Title: "+ super.title+
					"\nAuthor: " + super.author
					+"\nPrice: "+ this.price);
		}
}
