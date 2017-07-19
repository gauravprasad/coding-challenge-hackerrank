/*
Mark and Toys(Hackerrank java solution)

Mark and Jane are very happy after having their first kid. Their son is very fond of toys, so Mark wants to buy some. There are NN different toys lying in front of him, tagged with their prices, but he has only $K$K. He wants to maximize the number of toys he buys with this money.

Now, you are Mark's best friend and have to help him buy as many toys as possible.

Input Format
The first line contains two integers, NN and KK, followed by a line containing NN space separated integers indicating the products' prices.

Output Format
An integer that denotes maximum number of toys Mark can buy for his son.

Constraints
1≤N≤1051≤N≤105
1≤K≤1091≤K≤109
1≤price of any toy≤1091≤price of any toy≤109
A toy can't be bought multiple times.

Sample Input

7 50
1 12 5 111 200 1000 10

Sample Output

4

Explanation

He can buy only 4 toys at most. These toys have the following prices: 1,12,5,10.

 */
package com.gprasad.hackerrank.javasol.algo.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class MarkAndToys {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] listOfPrice = new int[n];
        for (int i = 0; i < n; i++) {
           listOfPrice[i]=input.nextInt();
        }
        Arrays.sort(listOfPrice);
        System.out.println(getTheTotalNumberOfToys(listOfPrice,k));
    }

    private static int getTheTotalNumberOfToys(int[] listOfPrice,int k) {
       int numOfToys=0;
       for(int i=0;i<listOfPrice.length && k>listOfPrice[i];i++)
       {
           numOfToys++;
           k-=listOfPrice[i];
       }
       return numOfToys;
    }

}
