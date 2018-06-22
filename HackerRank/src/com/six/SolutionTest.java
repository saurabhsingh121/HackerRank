package com.six;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SolutionTest {
	
public static void main(String[] args) throws FileNotFoundException {
	// Program to get the even and odd number of a string
	File f = new File("D://test.txt");
    
	Scanner scan1 = new Scanner(f);
	int NoOfTestCase = scan1.nextInt();
	
	for (int i = 0; i < NoOfTestCase+1; i++) {
		String str = scan1.nextLine();
		String oddString = "";
		String evenString = "";
		for (int j = 0; j < str.length(); j++) {
			if(j%2 ==1 ){
				oddString += str.charAt(j);
			}
			else {
				evenString += str.charAt(j);
			}
		}
		if(oddString != "" && evenString != ""){
		System.out.println(evenString +" "+ oddString);
		}
	}
}

}
