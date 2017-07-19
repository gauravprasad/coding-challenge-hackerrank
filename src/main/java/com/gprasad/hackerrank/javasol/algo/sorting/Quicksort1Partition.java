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
public class Quicksort1Partition {

    static void partition(int[] ar) {
        getPartition(0, ar.length - 1, ar);
        //quickSort(ar, 0, ar.length - 1);
        printArray(ar);
    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        partition(ar);
    }

    private static void getPartition(int lowerIndex, int higherIndex, int[] arr) {
        if (lowerIndex >= higherIndex) {
            return;
        }
        int lower = lowerIndex;
        int higher = higherIndex;
        int piviot = arr[lowerIndex + (higherIndex - lowerIndex) / 2];
        while (lower <= higher) {
            while (arr[lower] < piviot) {
                lower++;
            }
            while (arr[higher] > piviot) {
                higher--;
            }
            if (lower <= higher) {
                int temp = arr[lower];
                arr[lower] = arr[higher];
                arr[higher] = temp;
                lower++;
                higher--;
            }

        }
        if (lowerIndex < higher) {
            getPartition(lowerIndex, higher, arr);
        }
        if (higherIndex > lower) {
            getPartition(lower, higherIndex, arr);
        }

    }

    
}
