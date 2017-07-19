/*
 

Problem Statement

Given a square matrix of size N×N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12

Sample Output

15

Explanation

The primary diagonal is:

11
    5
        -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

        4
    5
10

Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

 */
package com.gprasad.hackerrank.javasol.algo.warmup;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int[][] intArr = new int[arrSize][arrSize];
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                intArr[i][j] = input.nextInt();
            }
        }
        int diff = 0;
        int diag1 = 0;
        int diag2 = 0;
        for(int i = 0 ;i<arrSize;i++)
        {
            diag1 = diag1+intArr[i][i];
            diag2 = diag2+intArr[i][arrSize-(i+1)];
        }
        diff = diag1-diag2;
        System.out.println(Math.abs(diff));
    }
}
