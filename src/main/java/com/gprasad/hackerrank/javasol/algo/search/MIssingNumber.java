/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.algo.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class MIssingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<Integer, Integer> A = new  HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x = input.nextInt();
            if(A.get(x)!=null)
            {
                A.put(x, A.get(x)+1);
            }
            else
            {
                A.put(x, 1);
            }
        }
        List<Integer> missing = new ArrayList<>();
        int m = input.nextInt();
        for(int i=0;i<m;i++)
        {
            int x = input.nextInt();
            Integer valA =A.get(x);
            if(valA==null|| valA==0)
            {
                if(!missing.contains(x))
                missing.add(x);
            }
            else
            {
                A.put(x, valA-1);
            }
            
        }
        Collections.sort(missing);
        for(Integer num : missing)
        {
            System.out.print(num+" ");
        }
    }
}
