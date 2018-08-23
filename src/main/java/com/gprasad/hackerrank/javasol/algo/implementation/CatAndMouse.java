package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CatAndMouse {
    static String catAndMouse(int x, int y, int z) {
        String first = null;
        Integer aPos = Math.abs(z - x);
        Integer bPos = Math.abs(z - y);
        if (aPos == bPos) {
            first = "Mouse C";
        } else if (aPos > bPos) {
            first = "Cat B";
        } else {
            first = "Cat A";
        }

        return first;
    }


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        IntStream.rangeClosed(1, input.nextInt()).forEach(x -> System.out.println(catAndMouse(input.nextInt(), input.nextInt(), input.nextInt())));
    }
}
