/*
 

Problem Statement

Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?

Input
You are given an integer N depicting the height of the staircase.

Output
Print a staircase of height N that consists of # symbols and spaces. For example for N=6, here's a staircase of that height:

     #
    ##
   ###
  ####
 #####
######

Note: The last line has 0 spaces before it.

 */
package com.gprasad.hackerrank.javasol.algo.warmup;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stairSize = input.nextInt();
        for(int i =0 ; i<stairSize; i++)
        {
            for(int j=1;j<stairSize-i;j++)
            {
                System.out.print(" ");
            }
            for(int j =0;j<=i;j++)
            {
                System.out.print("#");
            }
            
            System.out.print("\n");
        }
        
    }
}
