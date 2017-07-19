/*

Cut the sticks (HackerRank Java solution) 

Problem Statement

You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:

5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following:

3 2 2 6

The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format
The first line contains a single integer N.
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format
For each operation, print the number of sticks that are cut, on separate lines.

Constraints
1 ≤ N ≤ 1000
1 ≤ ai ≤ 1000

Sample Input #00

6
5 4 4 2 2 8

Sample Output #00

6
4
2
1

Sample Input #01

8
1 2 3 4 3 3 2 1

Sample Output #01

8
6
4
1

Explanation

Sample Case #00 :

sticks-length        length-of-cut   sticks-cut
5 4 4 2 2 8             2               6
3 2 2 _ _ 6             2               4
1 _ _ _ _ 4             1               2
_ _ _ _ _ 3             3               1
_ _ _ _ _ _           DONE            DONE

Sample Case #01

sticks-length         length-of-cut   sticks-cut
1 2 3 4 3 3 2 1         1               8
_ 1 2 3 2 2 1 _         1               6
_ _ 1 2 1 1 _ _         1               4
_ _ _ 1 _ _ _ _         1               1
_ _ _ _ _ _ _ _       DONE            DONE


 */
package com.gprasad.hackerrank.javasol.algo.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> sticks = new ArrayList<>();
        for (int arr_i = 0; arr_i < n; arr_i++) {
            sticks.add(in.nextInt());
        }
        Collections.sort(sticks);

        cutSticksCount(sticks);
    }

    public static void cutSticksCount(List<Integer> sticks) {

        System.out.println(sticks.size());
        Integer temp = sticks.get(0);
        for (int i=0;i<sticks.size();i++) {
            sticks.set(i, sticks.get(i)-temp);
        }
        while (!sticks.isEmpty() && sticks.get(0) == 0) {
            sticks.remove(0);
        }
        if (!sticks.isEmpty()) {
            cutSticksCount(sticks);
        }

    }
}
