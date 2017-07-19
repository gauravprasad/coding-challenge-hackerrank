/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.tutorial.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Day10BinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countOne(n));
    }

    private static int countOne(int n) {
        int max1 = 0;
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            } else {
                if (count > max1) {
                    max1 = count;
                }
                count = 0;
            }
            n = n / 2;
        }

        return count > max1 ? count : max1;
    }
    
}
