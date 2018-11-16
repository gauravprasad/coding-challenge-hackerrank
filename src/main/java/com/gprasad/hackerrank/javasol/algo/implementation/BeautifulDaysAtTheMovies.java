package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        Integer count = Math.toIntExact(IntStream.rangeClosed(i, j).map(num -> Math.abs(num - Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString())) % k).filter(m -> m == 0).count());
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
    }
}
