/*

Manasa and Stones (Hackerrank java solution)

Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either aa or bb. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. Given that the number on the first stone was 00, find all the possible values for the number on the last stone.

Note: The numbers on the stones are in increasing order.

Input Format
The first line contains an integer TT, i.e. the number of test cases. TT test cases follow; each has 3 lines. The first line contains nn (the number of stones). The second line contains aa, and the third line contains bb.

Output Format
Space-separated list of numbers which are the possible values of the last stone in increasing order.

Constraints
1≤T≤101≤T≤10
1≤n,a,b≤1031≤n,a,b≤103

Sample Input

2
3 
1
2
4
10
100

Sample Output

2 3 4 
30 120 210 300 

Explanation

All possible series for the first test case are given below:

    0,1,2
    0,1,3
    0,2,3
    0,2,4

Hence the answer 2 3 4.

Series with different number of final steps for second test case are the following:

    0, 10, 20, 30
    0, 10, 20, 120
    0, 10, 110, 120
    0, 10, 110, 210
    0, 100, 110, 120
    0, 100, 110, 210
    0, 100, 200, 210
    0, 100, 200, 300

Hence the answer 30 120 210 300.
 */
package com.gprasad.hackerrank.javasol.algo.implementation;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for(int t=0;t<testCase;t++)
        {
            int numStones = input.nextInt();
            int diff1= input.nextInt();
            int diff2= input.nextInt();
            int a=Math.min(diff1, diff2);
            int b=Math.max(diff1, diff2);
            if(a==b)
            {
                System.out.println(a*(numStones-1));
            }
            else
            {
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<numStones;i++)
                {
                    sb.append(i*b+(numStones-1-i)*a+" ");
                }
                
                System.out.println(sb);
            }
        }
    }
}
