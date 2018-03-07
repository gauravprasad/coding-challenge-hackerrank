package com.gprasad.hackerrank.javasol.algo.implementation;

/*
Kangaroo (Hackerrank Java solution)

There are two kangaroos on a number line ready to jump in the positive direction (i.e, toward ). Each kangaroo takes the same amount of time to make a jump, regardless of distance. That is, if kangaroo one jumps 3 meters and kangaroo two jumps 5 meters, they each do it in one second, for example.

Given the starting locations and jump distances for each kangaroo, determine if and when they will land at the same location at the same time.

Input Format

A single line of four space-separated integers denoting the respective values of x1, v1 , x2 , and v2.

Constraints

0 <= x1 < x2 <= 10000
1 < v1 < 10000
1 < v2 < 10000

Output Format

Print YES if they can land on the same location at the same time; otherwise, print NO.

Note: The two kangaroos must land at the same location after making the same number of jumps.

Sample Input 0

0 3 4 2
Sample Output 0

YES
Explanation 0

The two kangaroos jump through the following sequence of locations:
image
The kangaroos meet after 4 jumps.

Sample Input 1

0 2 5 3
Sample Output 1

NO
Explanation 1

Kangaroo 2 is travelling faster than kangaroo 1, so they will never meet.

 */

import java.util.Scanner;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        if(v1>v2)
        {
            if((x1-x2)%(v2-v1) == 0)
            {
                result = "YES";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

}
