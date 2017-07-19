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
public class RunningTimeofAlgorithms {
    public static void insertionSortPart2(int[] ar)
    {       
        int shift =0;
           for(int i=1;i<ar.length;i++)
           {
               int temp = ar[i];
               for(int j=i-1;j>=0 && temp<ar[j];j--)
               {
                   ar[j+1]=ar[j];
                   ar[j]=temp;
                   shift++;
               }
           }
           System.out.println(shift);
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    
}
