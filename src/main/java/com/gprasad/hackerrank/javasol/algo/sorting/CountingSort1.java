/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.algo.sorting;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class CountingSort1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int[] intArr = new int[arrSize];
        for(int i=0;i<arrSize;i++)
        {
            int inNum = input.nextInt();
            intArr[inNum]=intArr[inNum]+1;
        }
        for(int i=0;i<100;i++)
        {
            System.out.print(intArr[i]+" ");
        }
    }
}
