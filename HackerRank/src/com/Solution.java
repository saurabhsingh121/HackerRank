package com;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        int result = 0;
        int[][] another = new int[a.length][a.length];
        for(int row = 0; row < a.length ; row++){
            diagonal1 += a[row][row];
        }
        System.out.println(diagonal1);
        
        for(int row = 0, col = a.length-1; row < a.length && col >= 0; row++, col--){
            diagonal2 += a[row][col];
        }
        System.out.println(diagonal2);
             result =  diagonal1 - diagonal2;
            return Math.abs(result);
    }

    //private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = {{1,2,3},{2,4,5},{4,4,5}};

        /*for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }*/

        int result = diagonalDifference(a);
        System.out.println(result);
    }
}