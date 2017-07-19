/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.ds.arrays;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class TwoDArrayDS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int r = 0;r<6;r++)
        {
            for(int c=0;c<6;c++)
            {
                arr[r][c] = input.nextInt();
            }
        }
        int sum=-63;
        for(int r =0;r<6-2;r++)
        {
            for(int c=0;c<6-2;c++)
            {
               int total = arr[r][c]+arr[r][c+1]+arr[r][c+2]+ arr[r+1][c+1]+arr[r+2][c]+arr[r+2][c+1]+arr[r+2][c+2];
               if(sum<total)
               {
                   sum = total;
               }
            }
        }
        System.out.println(sum);
    }
}
