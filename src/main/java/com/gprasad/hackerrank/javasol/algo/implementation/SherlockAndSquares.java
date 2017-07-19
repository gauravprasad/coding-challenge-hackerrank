/*
 Problem Statement

 Watson gives two integers (A and B) to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

 Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.

 Input Format
 The first line contains T, the number of test cases. T test cases follow, each in a new line.
 Each test case contains two space-separated integers denoting A and B.

 Output Format
 For each test case, print the required answer in a new line.

 Constraints
 1≤T≤100
 1≤A≤B≤109

 Sample Input
 2
 3 9
 17 24

 Sample output
 2
 0

 Explanation
 Test Case #00: In range [3,9], 4 and 9 are the two square numbers.
 Test Case #01: In range [17,24], there are no square numbers. 
 */
package com.gprasad.hackerrank.javasol.algo.Implementation;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfTestCase = in.nextInt();
        for (int i = 0; i < noOfTestCase; i++) {
            long first = in.nextLong();
            long last = in.nextLong();
            System.out.println(getCount(first, last));
        }
    }

    private static int getCount(long first, long last) {
        int count = 0;
        count = (int)(Math.floor(Math.sqrt(last)) - Math.ceil(Math.sqrt(first)) + 1);
        return count;
    }

//    private static boolean isPerfectSquare(long n) {
//        boolean isPerfSqr = false;
//        long sqrt = (long) Math.sqrt(n);
//        if (sqrt * sqrt == n) {
//            isPerfSqr = true;
//        }
//        return isPerfSqr;
//    }
}
