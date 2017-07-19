/*
 
Hash Tables: Ransom Note (Hackerrank Java Solution)

Check out the resources on the page's right side to learn more about hashing. The video tutorial is by Gayle Laakmann McDowell, author of the best-selling interview book Cracking the Coding Interview.

A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

Input Format

The first line contains two space-separated integers describing the respective values of (the number of words in the magazine) and (the number of words in the ransom note).
The second line contains space-separated strings denoting the words present in the magazine.
The third line contains space-separated strings denoting the words present in the ransom note.

Constraints

    .
    Each word consists of English alphabetic letters (i.e., to and to ).
    The words in the note and magazine are case-sensitive.

Output Format

Print Yes if he can use the magazine to create an untraceable replica of his ransom note; otherwise, print No.

Sample Input

6 4
give me one grand today night
give one grand today

Sample Output

Yes

Explanation

All four words needed to write an untraceable replica of the ransom note are present in the magazine, so we print Yes as our answer.


 */
package com.gprasad.hackerrank.javasol.tutorial.crackingcodinginterview.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class HashTablesRansomNote {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public HashTablesRansomNote(String magazine, String note) {
        String[] magazineArr = magazine.split(" +");
        String[] noteArr = note.split(" +");
        magazineMap = new HashMap<>();
        noteMap = new HashMap<>();
        for (String str : magazineArr) {
            if (magazineMap.containsKey(str)) {
                magazineMap.put(str, magazineMap.get(str) + 1);
            } else {
                magazineMap.put(str, 1);
            }
        }
        for (String str : noteArr) {
            if (noteMap.containsKey(str)) {
                noteMap.put(str, noteMap.get(str) + 1);
            } else {
                noteMap.put(str, 1);
            }
        }
    }

    public boolean solve() {
        boolean isWordAvailable = true;
        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {

            if (!magazineMap.containsKey(entry.getKey())) {
                isWordAvailable = false;
                break;
            } else if (magazineMap.get(entry.getKey()) < entry.getValue()) {
                isWordAvailable = false;
                break;
            }
        }
        return isWordAvailable;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        HashTablesRansomNote s = new HashTablesRansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
