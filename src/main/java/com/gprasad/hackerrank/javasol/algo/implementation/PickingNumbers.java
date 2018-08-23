package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PickingNumbers {
    static int pickingNumbers(int[] a) {
        int length = 0;
        for (int i = 1; i < 100; i++) {
            length = Math.max(length, a[i] + a[i + 1]);
        }
        return length;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] a = new int[101];
        IntStream.range(0, input.nextInt()).forEach(i -> a[input.nextInt()]++);
        System.out.println(pickingNumbers(a));
    }
}
