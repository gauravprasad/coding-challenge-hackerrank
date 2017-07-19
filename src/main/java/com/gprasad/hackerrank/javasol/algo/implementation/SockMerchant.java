/*
Sock Merchant (HackerRank Java Solution)

John's clothing store has a pile of loose socks where each sock is labeled with an integer, , denoting its color. He wants to sell as many socks as possible, but his customers will only buy them in matching pairs. Two socks, and , are a single matching pair if .

Given and the color of each sock, how many pairs of socks can John sell?

Input Format

The first line contains an integer, , denoting the number of socks.
The second line contains space-separated integers describing the respective values of .

Constraints

Output Format

Print the total number of matching pairs of socks that John can sell.

Sample Input

9
10 20 20 10 10 30 50 10 20

Sample Output

3

Explanation

sock.png

As you can see from the figure above, we can match three pairs of socks. Thus, we print on a new line.
 */
package com.gprasad.hackerrank.javasol.algo.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by gprasad on 7/12/17.
 */
public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> pairMap = new HashMap<>();
        int sellCount = 0;
        for (int a : ar) {
            if (pairMap.containsKey(a)) {
                sellCount++;
                pairMap.remove(a);
            } else {
                pairMap.put(a, 1);
            }
        }
        return sellCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
