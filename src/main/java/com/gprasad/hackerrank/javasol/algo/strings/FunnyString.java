/*
 Suppose you have some string S having length N that is indexed from 0 to N−1. You also have some string R that is the reverse of string S. S is funny if the condition | S[j]−S[j−1] |=| R[j]−R[j−1] | is true for every j from 1 to N−1.

Note: For some string S, S[j] denotes the ASCII value of the jth zero-indexed character in S. The absolute value of some integer x is written as | x |.

Input Format

The first line contains an integer, T (the number of test cases).
The T subsequent lines each contain a string, where the ith line is string Si.

Constraints
1≤T≤10
0≤i≤T−1
2≤length of Si≤10000

Output Format

For each Si, print Funny or Not Funny on a new line.

Sample Input

2
acxz
bcxz

Sample Output

Funny
Not Funny

Explanation

Test Case 0: S0= "acxz"
|c−a|=2=|x−z|
|x−c|=21=|c−x|
|z−x|=2=|a−c|
We print Funny.

Test Case 1: S1= "bcxz"
|c−b|=1, but |x−z|=2
We stop evaluating the string (as |c−b|≠|x−z|), and print Not Funny. 
 */
package com.gprasad.hackerrank.javasol.algo.strings;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class FunnyString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfTestCase = input.nextInt();
        for(int i = 0 ; i < noOfTestCase ; i++)
        {
            String msg = "Funny";
            String strToCheck = input.next();
            for(int j = 1; j<strToCheck.length();j++)
            {
                int actI = strToCheck.charAt(j);
                int actImin1 = strToCheck.charAt(j-1);
                int revI = strToCheck.charAt((strToCheck.length()-1)-j);
                int revImin1 = strToCheck.charAt((strToCheck.length()-j));
                int actVal = actI-actImin1;
                int revVal = revI-revImin1;
                if(Math.abs(actVal)!=Math.abs(revVal))
                {
                    msg="Not Funny";
                    break;
                }
            }
            System.out.println(msg);
        }
    }
}
