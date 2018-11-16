package com.gprasad.hackerrank.javasol.algo.implementation;

import java.util.Scanner;


public class ViralAdvertising {
    static int viralAdvertising(int n) {
        int people = 5;
        int culamative =0;
        for(int i = 0; i < n; i++){
            people = (int) Math.floor(people/2);
            culamative += people;
            people *= 3;
        }
        return culamative;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
    }
}
