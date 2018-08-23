package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FormingAMagicSquare {
    static int formingMagicSquare(int[][] s) {

        return 0;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[][] s = new int[3][3];
        IntStream.range(0, 3).forEach(i -> IntStream.range(0, 3).forEach(j -> s[i][j] = input.nextInt()));
        System.out.println(formingMagicSquare(s));
    }
}
