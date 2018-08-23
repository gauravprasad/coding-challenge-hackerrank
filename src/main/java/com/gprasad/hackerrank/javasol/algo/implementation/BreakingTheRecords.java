package com.gprasad.hackerrank.javasol.algo.implementation;

/*
Breaking the Records (Hackerrank Java solution)


Maria plays n games of college basketball in a season. Because she wants to go pro, she tracks her points scored per game sequentially in an array defined as score = [S0, S1, ...... Sn-1]. After each game i, she checks to see if score Si breaks her record for most or least points scored so far during that season.

Given Maria's array of  scores for a season of n  games, find and print the number of times she breaks her record for most and least points scored during the season.

Note: Assume her records for most and least points at the start of the season are the number of points scored during the first game of the season.

Input Format

The first line contains an integer denoting  (the number of games).
The second line contains  space-separated integers describing the respective values of .

Constraints

1 <= n <= 10000
0 <= Si <= 10^8

Output Format

Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her worst (lowest) score decreased.

Sample Input 0

9
10 5 20 20 4 5 2 25 1
Sample Output 0

2 4
Explanation 0

The diagram below depicts the number of times Maria broke her best and worst records throughout the season:

image

She broke her best record twice (after games 2 and 7) and her worst record four times (after games 1, 4, 6, and 8), so we print 2 4 as our answer. Note that she did not break her record for best score during game 3, as her score during that game was not strictly greater than her best record at the time.

Sample Input 1

10
3 4 21 36 10 28 35 5 24 42
Sample Output 1

4 0
Explanation 1

The diagram below depicts the number of times Maria broke her best and worst records throughout the season:

image

She broke her best record four times (after games 1, 2, 3, and 9) and her worst record zero times (no score during the season was lower than the one she earned during her first game), so we print 4 0 as our answer.

 */

import java.util.Scanner;

public class BreakingTheRecords {
    static int[] breakingRecords(int[] score) {
        int[] result = new int[2];
        int max = 0;
        int min = 0;
        int lastLow = score[0];
        int lastHigh = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > lastLow) {
                max++;
                lastLow = score[i];
            } else if(score[i] < lastHigh){
                min++;
                lastHigh = score[i];
            }
        }
        result[0] = max;
        result[1] = min;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        System.out.println(result[0]+" "+result[1]);
        in.close();
    }
}
