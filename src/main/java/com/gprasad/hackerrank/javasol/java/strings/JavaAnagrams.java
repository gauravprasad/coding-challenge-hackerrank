/*
 Two strings A and B are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".

Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.

This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.

Sample Input 1

anagram
margana

Sample Output 1:

Anagrams

Sample Input 2

anagramm
marganaa

Sample Output 2:

Not Anagrams

 */
package com.gprasad.hackerrank.javasol.java.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }

    private static boolean isAnagram(String A, String B) {
        char[] aArr = A.toLowerCase().toCharArray();
        char[] bArr = B.toLowerCase().toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        return Arrays.equals(aArr, bArr);
    }
}
