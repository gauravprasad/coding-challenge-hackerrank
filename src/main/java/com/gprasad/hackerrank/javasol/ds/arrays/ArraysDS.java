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
public class ArraysDS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
