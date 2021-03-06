/*
Find Point (HackerRank Java Solution)

Given two points P and Q, output the symmetric point of point P about Q.

Input Format
The first line contains an integer TT representing the number of testcases
Each test case is a line containing four space separated integers Px Py Qx QyPx Py Qx Qy representing the (x,y)(x,y) coordinates of PP and QQ.

Constraints
1⩽T⩽151⩽T⩽15
−100⩽x,y⩽100−100⩽x,y⩽100

Output Format
For each test case output x and y coordinates of the symmetric point (each point in a new line).

Sample Input

2
0 0 1 1
1 1 2 2

Sample Output

2 2
3 3

 */
package com.gprasad.hackerrank.javasol.fundamentals;

import java.util.Scanner;

/**
 *
 * @author Gaurav Prasad
 */
public class FindPoint {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int T = input.nextInt();
         for(int i=0;i<T;i++)
         {
             int px = input.nextInt();
             int py = input.nextInt();
             int qx = input.nextInt();
             int qy = input.nextInt();
             int ax = qx-px;
             int ay = qy-py;
             int sx = qx+ax;
             int sy = qy+ay;
             System.out.println((sx)+ " "+(sy));
         }
    }
}
