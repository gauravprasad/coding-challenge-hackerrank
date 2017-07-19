/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.algo.search;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfTestCase = input.nextInt();
        for(int test=0;test<noOfTestCase;test++)
        {
            int total = 0;
            int sizeArr = input.nextInt();
            int[] arr = new int[sizeArr];
            for(int i=0;i<sizeArr;i++)
            {
                arr[i]=input.nextInt();
                total = total+arr[i];
            }
            
            System.out.println(isAvailable(arr, total)?"YES":"NO");
        }
    }
    
    private static boolean isAvailable(int[] arr, int total)
    {
        if(arr.length==1)
        {
            return true;
        }
        if(arr.length==2)
        {
            return false;
        }
        int left =0;
        int right = 0;
        for(int i =1 ; i<arr.length-1;i++)
        {
            left = left+arr[i-1];
            right = total - arr[i]-left;
            if(left==right)
            {
                return true;
            }
        }
        return false;
        
    }
    private static boolean isAvailable(int[] arr, int index, int lSum, int rSum)
    {
        int i = index-1;
        int j = index+1;
        while (i>-1) {
            lSum = lSum+arr[i--];
        }
        while(j<arr.length)
        {
            rSum = rSum+arr[j++];
        }
        
        return (lSum==rSum)?true:(index==arr.length-1)?false:isAvailable(arr, index+1, 0, 0);
    }
}
