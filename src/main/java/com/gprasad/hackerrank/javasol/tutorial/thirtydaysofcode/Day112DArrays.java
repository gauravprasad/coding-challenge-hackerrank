/*
 
 */
package com.gprasad.hackerrank.javasol.tutorial.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Day112DArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(hourGlassSum(arr));
    }
    
    private static int hourGlassSum(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<4;i++)
        {
           for(int j=1;j<5;j++)
           {
               int totalSum = arr[i][j-1]+arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+2][j-1]+arr[i+2][j]+arr[i+2][j+1];
               if(totalSum>max)
               {
                   max=totalSum;
               }
           }
        }
        return max;
    }
    
    
}
