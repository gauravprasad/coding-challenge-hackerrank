/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.algo.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfTestCase = input.nextInt();
        for(int test=0;test<noOfTestCase;test++)
        {
            Map<Integer, Integer> numIndexMap = new HashMap<>();
            int total = input.nextInt();
            int sizeArr = input.nextInt();
            String output = null;
            for(int i=0;i<sizeArr;i++)
            {
                int price = input.nextInt();
                int temp = total-price;
                if(numIndexMap.get(temp)!=null)
                {
                    output = (numIndexMap.get(temp)+1)+" "+(i+1);
                }
                else
                {
                    numIndexMap.put(price, i);
                }
            }
            System.out.println(output);
        }
    }
}
