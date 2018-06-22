package com.ten;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*Given a base-10 integer,n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.*/
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> q = new LinkedList<Integer>();
        int n = in.nextInt();
        int remainder = 0;
        while(n > 0){
        	remainder = n%2;
        	q.addFirst(remainder);
        	n = n/2;
        }
        Iterator itr = q.iterator();
        int maxLength = 0;
        int tempLength = 0;
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element);
            System.out.println();
            int a = (Integer) element;
            if (a == 1) {
                tempLength++;
            } else {
                tempLength = 0;
            }

            if (tempLength > maxLength) {
                maxLength = tempLength;
            }
         }
        System.out.println(maxLength);
    }
}
