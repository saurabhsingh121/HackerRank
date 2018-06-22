package com.eleven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\test.txt");
		Scanner in = new Scanner(file);
		int arr[][] = new int[6][6];
		int tempArr[][] = new int[3][3];
		int counter = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		/*for (counter = 0; counter < 4; counter++) {
			for (int i = counter; i < counter + 3; i++) {
				for (int j = counter; j < counter + 3; j++) {
					tempArr[i][j] = arr[i][j];
				}
			}
			for (int i = 0; i < 3; i++) {
				for (int j = counter; j < counter + 3; j++) {
					System.out.print(tempArr[i][j]);
				}
				System.out.println();
			}
		}*/
	}
}
