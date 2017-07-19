/*
 
Priyanka and Toys(Hackerrank Java Solution)

Little Priyanka visited a kids' shop. There are NN toys and their weight is represented by an array W=[w1,w2,…,wN]W=[w1,w2,…,wN]. Each toy costs 1 unit, and if she buys a toy with weight w′w′, then she can get all other toys whose weight lies between [w′,w′+4][w′,w′+4] (both inclusive) free of cost.

Input Format

The first line contains an integer NN i.e. number of toys.
Next line will contain NN integers, w1,w2,…,wNw1,w2,…,wN, representing the weight array.

Output Format

Minimum units with which Priyanka could buy all of toys.

Constraints
1≤N≤1051≤N≤105
0≤wi≤104,where i∈[1,N]0≤wi≤104,where i∈[1,N]

Sample Input

5
1 2 3 17 10

Sample Output

3

Explanation

She buys 1st1st toy with weight 11 for 11 unit and gets 2nd2nd and 3rd3rd toy for free since their weight lies between [1,5][1,5]. And she has to buy last two toys separately.

 */
package com.gprasad.hackerrank.javasol.algo.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class PriyankaAndToys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] weightArr = new int[n];
        for(int i=0;i<n;i++)
        {
            weightArr[i] = input.nextInt();
        }
        Arrays.sort(weightArr);
        System.out.println(getTheMinimumUnit(weightArr));
    }

    private static int getTheMinimumUnit(int[] weightArr) {
        int minimumUnit = 1;
        int initWt = weightArr[0];
        for(int i=1;i<weightArr.length;i++)
        {
            if(weightArr[i]>initWt+4)
            {
                minimumUnit++;
                initWt=weightArr[i];
            }
        }
        return minimumUnit;
    }
}
