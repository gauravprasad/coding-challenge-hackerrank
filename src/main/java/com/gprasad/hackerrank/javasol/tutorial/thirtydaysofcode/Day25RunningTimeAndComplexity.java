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
public class Day25RunningTimeAndComplexity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while(testCase-->0)
        {
            System.out.println(isPrime(input.nextInt())?"Prime":"Not prime");
        }
    }

    private static boolean isPrime(int n) {
        boolean isPrime = true;
        if(n<2)
        {
            isPrime = false;
        }
        else
        {
            for(int i =2;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
