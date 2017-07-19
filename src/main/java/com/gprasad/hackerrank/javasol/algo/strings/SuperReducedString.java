/*
 
Super Reduced String  (Hackerrank Java Solution)

Shil has a string, , consisting of lowercase English letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "" would become either "" or "" after operation.

Shil wants to reduce as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Shil out by finding and printing 's non-reducible form!

Note: If the final string is empty, print .

Input Format

A single string, .

Constraints

Output Format

If the final string is empty, print ; otherwise, print the final non-reducible string.

Sample Input 0

aaabccddd

Sample Output 0

abd

Sample Input 1

baab

Sample Output 1

Empty String

Sample Input 2

aa

Sample Output 2

Empty String

Explanation

Sample Case 0:
Shil can perform the following sequence of operations to get the final string:

Thus, we print .

Sample Case 1:
Shil can perform the following sequence of operations to get the final string:




 */
package com.gprasad.hackerrank.javasol.algo.strings;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class SuperReducedString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                str = str.substring(0,i-1).concat(str.substring(i+1));
                i=0;
            }
        }
        System.out.println(str.isEmpty() ? "Empty String" : str);

    }
}
