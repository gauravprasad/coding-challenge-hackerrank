package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        Integer valley = 0;
        Integer level = 0;
        for(char c : s.toCharArray())
        {
            if(c=='U') level++;
            if(c=='D') level--;
            if(level==0 && c=='U') valley++;
        }
        return valley;
    }


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String steps = input.next();
        int result = countingValleys(n, steps);
        System.out.println(result);
    }
}
