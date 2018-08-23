package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        int maxHeight = Arrays.stream(height).max().getAsInt();
        return maxHeight > k ? maxHeight - k : 0;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] height = IntStream.range(0, n).map(i -> input.nextInt()).toArray();
        int result = hurdleRace(k, height);
        System.out.println(result);
    }
}
