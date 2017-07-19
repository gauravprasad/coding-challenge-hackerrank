/*
 
Arrays: Left Rotation (Hackerrank Java Solution)


Check out the resources on the page's right side to learn more about arrays. The video tutorial is by Gayle Laakmann McDowell, author of the best-selling interview book Cracking the Coding Interview.

A left rotation operation on an array of size shifts each of the array's elements unit to the left. For example, if left rotations are performed on array , then the array would become .

Given an array of integers and a number, , perform left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of (the number of integers) and (the number of left rotations you must perform).
The second line contains space-separated integers describing the respective elements of the array's initial state.

Constraints

Output Format

Print a single line of space-separated integers denoting the final state of the array after performing left rotations.

Sample Input

5 4
1 2 3 4 5

Sample Output

5 1 2 3 4

Explanation

When we perform left rotations, the array undergoes the following sequence of changes:

Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.

 */
package com.gprasad.hackerrank.javasol.tutorial.crackingcodinginterview.ds;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class ArraysLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        for (int i = 0; i < k; i++) {
            a = rotateByOnePlace(a, n);
        }
        return a;
    }
    
    public static int[] arrayLeftRotationAlter(int[] a, int n, int k) {
        int b[] = new int[n];
        int bIndex = 0;
        for (int i = k; i < n; i++) {
            b[bIndex] = a[i];
            bIndex++;
        }
        for(int i=0;i<k;i++)
        {
            b[bIndex] = a[i];
            bIndex++;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotationAlter(a, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }

        System.out.println();

    }

    private static int[] rotateByOnePlace(int[] a, int n) {
        int i, temp;
        temp = a[0];
        for (i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[i] = temp;
        return a;
    }
}
