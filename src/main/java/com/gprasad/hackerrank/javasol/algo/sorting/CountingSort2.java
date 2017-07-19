/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.algo.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class CountingSort2 {

    public static void main(String[] args) {
        Map<Integer, Integer> numberCount = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int[] intArr = new int[100];
        for (int i = 0; i < arrSize; i++) {
            int key = input.nextInt();
            intArr[key] = intArr[key]+1;
        }
        for (int i = 0; i < 100; i++) {
            if (intArr[i] != 0) {
                for (int j = 0; j < intArr[i]; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
