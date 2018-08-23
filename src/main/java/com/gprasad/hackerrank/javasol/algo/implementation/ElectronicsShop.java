package com.gprasad.hackerrank.javasol.algo.implementation;


import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ElectronicsShop {

    static int getMoneySpent(Integer[] keyboards, Integer[] drives, int b) {
        Integer max = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sum = keyboards[i] + drives[j];
                if (sum<=b && sum >= max) max = sum;
            }
        }
        return max;
    }


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int n = input.nextInt();
        int m = input.nextInt();
        Integer[] keyboards = IntStream.range(0, n).map(i -> input.nextInt()).boxed().toArray(Integer[]::new);
        Integer[] drives = IntStream.range(0, m).map(i -> input.nextInt()).boxed().toArray(Integer[]::new);
        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);
    }
}
