/*
Pairs (Hackerrank Java olution )
 Given N integers, count the number of pairs of integers whose difference is K.

Input Format

The first line contains N and K.
The second line contains N numbers of the set. All the N numbers are unique.

Output Format

An integer that tells the number of pairs of integers whose difference is K.

Constraints:
N≤105
0<K<109
Each integer will be greater than 0 and at least K smaller than 231−1.

Sample Input

5 2  
1 5 3 4 2  

Sample Output

3

Explanation

There are 3 pairs of integers in the set with a difference of 2.
 */
package com.gprasad.hackerrank.javasol.algo.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Pairs {

    private static int pairs(Map<Long, Integer> numberMap, Long k) {
        int numberOfPair = 0;
        for (Map.Entry<Long, Integer> entry : numberMap.entrySet()) {
            Long key = entry.getKey();
            if (numberMap.containsKey(key + k)) {
                numberOfPair++;
            }
        }
        return numberOfPair;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Long K = input.nextLong();
        Map<Long, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            numberMap.put(input.nextLong(), i);
        }
        System.out.println(pairs(numberMap, K));
    }
}
