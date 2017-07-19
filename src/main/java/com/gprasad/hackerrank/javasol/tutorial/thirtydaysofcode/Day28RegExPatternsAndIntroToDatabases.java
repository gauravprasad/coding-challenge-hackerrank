/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.tutorial.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author gq6pras
 */
public class Day28RegExPatternsAndIntroToDatabases {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String emailRegex = ".+@gmail\\.com$"; 
        Pattern pattern = Pattern.compile(emailRegex);
        List<String> list = new ArrayList<>();
        for (int a0 = 0; a0 < N; a0++) {
            String firstName = in.next();
            String emailID = in.next();
            Matcher matcher = pattern.matcher(emailID);
            if(matcher.find())
            {
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String string : list) {
            System.out.println(string);
        }
    }
}
