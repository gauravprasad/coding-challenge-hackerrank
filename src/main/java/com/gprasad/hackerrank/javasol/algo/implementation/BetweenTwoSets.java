/**
 * Between Two Sets ()
 * <p>
 * You will be given two arrays of integers. You will be asked to determine all integers that satisfy the following two conditions:
 * <p>
 * The elements of the first array are all factors of the integer being considered
 * The integer being considered is a factor of all elements of the second array
 * These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.
 * <p>
 * Input Format
 * <p>
 * The first line contains two space-separated integers describing the respective values of , the number of elements in array , and , the number of elements in array .
 * The second line contains  distinct space-separated integers describing .
 * The third line contains  distinct space-separated integers describing .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the number of integers that are considered to be between  and .
 * <p>
 * Sample Input
 * <p>
 * 2 3
 * 2 4
 * 16 32 96
 * Sample Output
 * <p>
 * 3
 * Explanation
 * <p>
 * 2 and 4 divide evenly into 4, 8, 12 and 16.
 * 4, 8 and 16 divide evenly into 16, 32, 96.
 * <p>
 * 4, 8 and 16 are the only three numbers for which each element of A is a factor and each is a factor of all elements of B.
 */
package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BetweenTwoSets {
    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
        return 0;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
