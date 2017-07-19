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
public class SearchElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int searchNum = input.nextInt();
        int arrSize = input.nextInt();
        int[] intArr = new int[arrSize];
        for(int i = 0; i<arrSize;i++)
        {
            intArr[i] = input.nextInt();
        }
        for(int i=0;i<arrSize;i++)
        {
            if(intArr[i]==searchNum)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
