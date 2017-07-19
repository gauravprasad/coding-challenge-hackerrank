/*
 Alice recently started learning about cryptography and found that anagrams are very useful. Two strings are anagrams of each other if they have same character set (and frequency of characters) and same length. For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.

Alice decides on an encryption scheme involving 2 large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. She need your help in finding out this number.

Given two strings (they can be of same or different length) help her in finding out the minimum number of character deletions required to make two strings anagrams. Any characters can be deleted from any of the strings.

Input Format
Two lines each containing a string.

Constraints
1 <= Length of A,B <= 10000
A and B will only consist of lowercase latin letter.

Output Format
A single integer which is the number of character deletions.

Sample Input #00:

cde
abc

Sample Output #00:

4

Explanation #00:
We need to delete 4 characters to make both strings anagram i.e. 'd' and 'e' from first string and 'b' and 'a' from second string. 
 */
package com.gprasad.hackerrank.javasol.algo.strings;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class MakeItAnagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        System.out.println(getTotalDeletedChar(A,B));
    }

    private static int getTotalDeletedChar(String A, String B) {
        Integer deletedCharCount = 0;
        int[] aArr = new int[26];
        int[] bArr = new int[26];
        for(int i=0;i<A.length();i++)
        {
            int index = A.charAt(i)-'a';
            aArr[index]++;
        }
        for(int i=0;i<B.length();i++)
        {
            int index = B.charAt(i)-'a';
            bArr[index]++;
        }
        for(int i = 0; i<26;i++)
        {
            if(aArr[i]<bArr[i])
            {
                deletedCharCount = deletedCharCount+(bArr[i]-aArr[i]);
            }
            if(bArr[i]<aArr[i])
            {
                deletedCharCount = deletedCharCount+(aArr[i]-bArr[i]);
            }
        }
        return deletedCharCount;
    }

}
