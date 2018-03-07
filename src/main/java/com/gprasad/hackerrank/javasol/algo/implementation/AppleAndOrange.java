package com.gprasad.hackerrank.javasol.algo.implementation;

/*
Apple and Orange (Hackerrank Java solution)

Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Sam’s two children, Larry and Rob, decide to play a game in which they each climb a tree and throw fruit at their (Sam’s) house. Each fruit that lands on the house scores one point for the one who threw it. Larry climbs the tree on the left (the apple), and Rob climbs the one on the right (the orange).

We’ll use the following diagram to describe the challenge:

Apple and orange(2).png

For simplicity, we’ll assume all of the landmarks are on a number line. Larry climbs the apple tree at point , and Rob climbs the orange tree at point . Sam’s house stands between points  and . Values increase from left to right.

You will be given a list of distances the fruits are thrown. Negative distances indicate travel left and positive distances, travel right. Your task will be to calculate the scores for Larry and Rob and report them each on a separate line.

Input Format

The first line contains two space-separated integers denoting the respective values of  and .
The second line contains two space-separated integers denoting the respective values of  and .
The third line contains two space-separated integers denoting the respective values of  and .
The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point .
The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point .

Constraints

Output Format

Print two lines of output:

On the first line, print the number of apples that fall on Sam's house.
On the second line, print the number of oranges that fall on Sam's house.
Sample Input 0

7 11
5 15
3 2
-2 2 1
5 -6
Sample Output 0

1 1
Explanation 0

The first apple falls at position 5-2 = 3
The second apple falls at position 5+2 = 7
The third apple falls at position 5+1 =6
The first orange falls at position 15+5 =20
The second orange falls at position 15 - 6 = 9

Only one fruit (the second apple) falls within the region between  and , so Larry’s score is .
Only the second orange falls within the region between  and , so Rob’s score is .


 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int lPoint = 0;
        int pPoint = 0;
        for (int i = 0; i < apples.length; i++) {
            lPoint += rangeCheck(s, t, (a + apples[i]));
        }

        for (int i = 0; i < oranges.length; i++) {
            pPoint += rangeCheck(s, t, (b + oranges[i]));
        }

        System.out.println(lPoint);
        System.out.println(pPoint);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }

    static int rangeCheck(int lower, int upper, int val) {
        if ((val >= lower) && (val <= upper)) {
            return 1;
        }
        return 0;
    }
}
