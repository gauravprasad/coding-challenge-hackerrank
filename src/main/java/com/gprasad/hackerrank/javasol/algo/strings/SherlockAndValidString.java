/*
Sherlock and Valid String (Java solution)


You know my powers, my dear Watson, and yet at the end of three months I was forced to confess that I had at last met an antagonist who was my intellectual equal.

A "valid" string is a string SS such that for all distinct characters in SS each such character occurs the same number of times in SS.

For example, aabb is a valid string because the frequency of both characters a and b is 22, whereas aabbc is not a valid string because the frequency of characters a, b, and c is not the same.

Watson gives a string SS to Sherlock and asks him to remove some characters from the string such that the new string is a "valid" string.

Sherlock wants to know from you if it's possible to be done with less than or equal to one removal.

Input Format

The first and only line contains SS, the string Watson gives to Sherlock.

Output Format

Output YES if string SS can be converted to a "valid" string by removing less than or equal to one character.
Else, output NO.

Constraints:

1≤size of stringS≤1051≤size of stringS≤105
String SS contains lowercase letters (a-z) only.

Sample Input

aabbcd

Sample Output

NO

Explanation

22 is the minimum number of removals required to make it a valid string. It can be done in following two ways:

Remove c and d to get aabb.
Or remove a and b to get abcd.

 */
package com.gprasad.hackerrank.javasol.algo.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class SherlockAndValidString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(isValid(str)?"YES":"NO");
    }

    private static boolean isValid(String str) {
        int temp = 0;
        List<Integer> diffCharCount = new ArrayList<>();
        for(int i=97;i<(97+26);i++)
        {
            char c = (char) i;
            int lenSubStr = str.replaceAll("[^"+c+"]","").length();
            if(temp==0)
            {
                temp=lenSubStr;
                diffCharCount.add(lenSubStr);
            }
            else
            {
                if(temp!=lenSubStr && lenSubStr!=0)
                {
                    diffCharCount.add(lenSubStr);
                }
            }
        }
        return diffCharCount.size()<3;
    }

}
