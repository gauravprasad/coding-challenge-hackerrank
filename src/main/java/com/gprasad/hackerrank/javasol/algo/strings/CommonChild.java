/*

Common Child (Hackerrank Java Solution)


Given two strings a and b of equal length, what's the longest string (S) that can be constructed such that it is a child of both?

A string x is said to be a child of a string y if x can be formed by deleting 0 or more characters from y.

For example, ABCD and ABDC has two children with maximum length 3, ABC and ABD. Note that we will not consider ABCD as a common child because C doesn't occur before D in the second string.

Input format

Two strings, a and b, with a newline separating them.

Constraints

All characters are upper cased and lie between ASCII values 65-90. The maximum length of the strings is 5000.

Output format

Length of string S.

Sample Input #0

HARRY
SALLY

Sample Output #0

2

The longest possible subset of characters that is possible by deleting zero or more characters from HARRY and SALLY is AY, whose length is 2.

Sample Input #1

AA
BB

Sample Output #1

0

AA and BB has no characters in common and hence the output is 0.

Sample Input #2

SHINCHAN
NOHARAAA

Sample Output #2

3

The largest set of characters, in order, between SHINCHAN and NOHARAAA is NHA.

Sample Input #3

ABCDEF
FBDAMN

Sample Output #3

2

BD is the longest child of these strings.
 */
package com.gprasad.hackerrank.javasol.algo.strings;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Gaurav Prasad
 */
public class CommonChild {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        System.out.println(getLengthOfChild(a, b));
    }

    private static int getLengthOfChild(String a, String b) {
        int lenOfChild = 0;
        SortedMap<Integer, Character> aMap = new TreeMap<>();
        SortedMap<Integer, Character> bMap = new TreeMap<>();
        for (int i = 65; i < (65 + 26); i++) {
            if (a.indexOf(i) != -1 && b.indexOf(i) != -1) {
                aMap.put(a.indexOf(i), (char) i);
                aMap.put(b.indexOf(i), (char) i);
            }
        }
        char charA = aMap.get(aMap.firstKey());

        return lenOfChild;
    }

    private static int lcsOptimized(String input1, String input2) {
        int start = 0;
        int inEnd1 = input1.length() - 1;
        int inEnd2 = input2.length() - 1;

        while (start <= inEnd1 && start <= inEnd2 && input1.charAt(start) == input2.charAt(start)) {
            start++;
        }

        while (start <= inEnd1 && start <= inEnd2 && input1.charAt(inEnd1) == input2.charAt(inEnd2)) {
            inEnd1--;
            inEnd2--;
        }
        int[][] table = new int[inEnd1 - start + 1][inEnd2 - start + 1];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = input1.length() - inEnd1 - 1;
            }
        }

        for (int i = start; i < inEnd1; i++) {
            for (int j = start; j < inEnd2; j++) {
                if (input1.charAt(i) == input2.charAt(j)) {
                    table[i + 1][j + 1] = table[i][j] + 1;
                } else {
                    table[i + 1][j + 1] = table[i + 1][j] > table[i][j + 1] ? table[i + 1][j]
                            : table[i][j + 1];
                }
            }
        }

        return table[inEnd1][inEnd2];
    }

}
