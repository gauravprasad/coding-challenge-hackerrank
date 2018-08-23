package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Birthday Chocolate
 * <p>
 * Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. She decides to share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can divide the chocolate.
 * <p>
 * Consider the chocolate bar as an array of squares, . She wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria:  and .
 * <p>
 * Function Description
 * <p>
 * Complete the birthday function in the editor below. It should return an integer denoting the number of ways Lily can divide the chocolate bar.
 * <p>
 * birthday has the following parameter(s):
 * <p>
 * s: an array of integers, the numbers on each of the squares of chocolate
 * d: an integer, Ron's birth day
 * m: an integer, Ron's birth month
 * Input Format
 * <p>
 * The first line contains an integer , the number of squares in the chocolate bar.
 * The second line contains  space-separated integers , the numbers on the chocolate squares where .
 * The third line contains two space-separated integers,  and , Ron's birth day and his birth month.
 * <p>
 * Constraints
 * <p>
 * , where ()
 * Output Format
 * <p>
 * Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.
 * <p>
 * Sample Input 0
 * <p>
 * 5
 * 1 2 1 3 2
 * 3 2
 * Sample Output 0
 * <p>
 * 2
 * Explanation 0
 * <p>
 * Lily wants to give Ron  squares summing to . The following two segments meet the criteria:
 * <p>
 * image
 * <p>
 * Sample Input 1
 * <p>
 * 6
 * 1 1 1 1 1 1
 * 3 2
 * Sample Output 1
 * <p>
 * 0
 * Explanation 1
 * <p>
 * Lily only wants to give Ron  consecutive squares of chocolate whose integers sum to . There are no possible pieces satisfying these constraints:
 * <p>
 * image
 * <p>
 * Thus, we print  as our answer.
 * <p>
 * Sample Input 2
 * <p>
 * 1
 * 4
 * 4 1
 * Sample Output 2
 * <p>
 * 1
 * Explanation 2
 * <p>
 * Lily only wants to give Ron  square of chocolate with an integer value of . Because the only square of chocolate in the bar satisfies this constraint, we print  as our answer.
 */

public class BirthdayChocolate {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        Integer count = 0;
        for(int i = 0; i < s.size() - m +1; i++)
        {
            int sum = 0;
            for(int j = i; j < i + m; j++){
                sum += s.get(j);
            }
            if(sum == d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(input.nextInt());
        }
        Integer d = input.nextInt();
        Integer m = input.nextInt();
        int result = birthday(s, d, m);
        System.out.println(result);
    }

}
