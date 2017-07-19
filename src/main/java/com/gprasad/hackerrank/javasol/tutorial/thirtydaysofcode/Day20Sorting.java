/*

 */
package com.gprasad.hackerrank.javasol.tutorial.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Day20Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);
    }
    private static void bubbleSort(int[] arr)
    {
        int swapCount = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                   int temp= arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1] = temp;
                    swapCount++;
                }
            }
        }
        System.out.println("Array is sorted in "+swapCount+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);
    }

    
}
