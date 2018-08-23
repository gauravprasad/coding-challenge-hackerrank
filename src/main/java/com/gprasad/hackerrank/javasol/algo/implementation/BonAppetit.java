package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        bill.remove(k);
        Integer bonAppetit = b-(bill.stream().mapToInt(Integer::intValue).sum()/2);
        if(bonAppetit ==0){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(bonAppetit);
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        List<Integer> bill = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bill.add(input.nextInt());
        }
        int b = input.nextInt();
        bonAppetit(bill, k, b);

    }
}
