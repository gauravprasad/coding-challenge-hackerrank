/*
 

Problem Statement

You are given an array of integers of size N. Can you find the sum of the elements in the array?

Input
The first line of input consists of an integer N. The next line contains N space-separated integers representing the array elements.
Sample:

6

1 2 3 4 10 11

Output
Output a single value equal to the sum of the elements in the array.
For the sample above you would just print 31 since 1+2+3+4+10+11=31.

 */
package com.gprasad.hackerrank.javasol.algo.warmup;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int[] intArr = new int[arrSize];
        for(int i =0 ; i<arrSize; i++)
        {
            intArr[i] = input.nextInt();
        }
        int sum = 0;
        for(Integer num : intArr)
        {
            sum = sum+num;
        }
        System.out.println(sum);
    }
}
