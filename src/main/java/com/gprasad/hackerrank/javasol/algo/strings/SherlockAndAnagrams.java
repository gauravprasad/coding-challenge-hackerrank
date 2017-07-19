/*
 Given a string S, find the number of "unordered anagrammatic pairs" of substrings.

Input Format
First line contains T, the number of testcases. Each testcase consists of string S in one line.

Constraints
1≤T≤10
2≤length(S)≤100
String S contains only the lowercase letters of the English alphabet.

Output Format
For each testcase, print the required answer in one line.

Sample Input#00

2
abba
abcd

Sample Output#00

4
0

Sample Input#01

5
ifailuhkqq
hucpoltgty
ovarjsnrbf
pvmupwjjjf
iwwhrlkpek

Sample Output#01

3
2
2
6
3

Explanation

Sample00
Let's say S[i,j] denotes the substring Si,Si+1,⋯,Sj.

testcase 1:
For S=abba, anagrammatic pairs are: {S[1,1],S[4,4]}, {S[1,2],S[3,4]}, {S[2,2],S[3,3]} and {S[1,3],S[2,4]}.

testcase 2:
No anagrammatic pairs.

Sample01
Left as an exercise to you
 */
package com.gprasad.hackerrank.javasol.algo.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class SherlockAndAnagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for(int i=0;i<testCase;i++)
        {
            System.out.println(getTotalPair(input.next()));
        }
    }

    private static int getTotalPair(String str) {
        int totalPair = 0;
        Map<String,Integer> charArrWordMap = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=1;j<=str.length()-i;j++)
            {
                String subStr = str.substring(i, j+i);
                char[] subStrArr = subStr.toCharArray();
                Arrays.sort(subStrArr);
                String sortedString = new String(subStrArr);
                if(charArrWordMap.containsKey(sortedString))
                {
                    Integer count = charArrWordMap.get(sortedString);
                    charArrWordMap.put(sortedString, count+1);
                }
                else
                {
                    charArrWordMap.put(sortedString, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : charArrWordMap.entrySet()) {
            Integer value = entry.getValue();
            totalPair = totalPair+(value/2);
        }
        return totalPair;
    }
    
}
