/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.algo.strings;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noTestCase = input.nextInt();
        for(int i = 0; i<noTestCase; i++)
        {
            String delString = input.next();
            int delCount = 0;
            char x = '\0';
            for(int j=0;j<delString.length();j++)
            {
                if((x!='\0')&& (delString.charAt(j)==x))
                {
                    delCount++;
                }
                x=delString.charAt(j);
            }
            System.out.println(delCount);
        }
    }
   
    
}
