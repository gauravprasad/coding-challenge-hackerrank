package com.gprasad.hackerrank.javasol.algo.implementation;

/*
Divisible Sum Pairs (Hackerrank Java solution)

You are given an array of  integers, A0,A1,.....,An-1 and a positive integer, k. Find and print the number of (i,j) pairs where i<j and  Ai+Aj  is divisible by k.

Input Format

The first line contains 2 space-separated integers, n and k.
The second line contains n space-separated integers describing the values of ar[A0,A1,.....,An-1].

Constraints

2 <= n <= 100
1 <= k <=100
1 <= Ai <= 100

Output Format

Print the number of (i, j) pairs where i < j and  Ai + Aj is evenly divisible by k.

Sample Input

6 3
1 3 2 6 1 2
Sample Output

 5
Explanation

Here are the 5 valid pairs when k = 3:

(0,2) -> A0 + A2 = 1 + 2 = 3
(0,5) -> A0 + A5 = 1 + 2 = 3
(1,3) -> A1 + A3 = 3 + 6 = 9
(2,4) -> A2 + A4 = 2 + 1 = 3
(4,5) -> A4 + A5 = 1 + 2 = 3
 */

import java.util.Scanner;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairs = 0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((ar[i]+ar[j])%k == 0)
                {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
