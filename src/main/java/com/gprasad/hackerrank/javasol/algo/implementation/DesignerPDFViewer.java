package com.gprasad.hackerrank.javasol.algo.implementation;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        int maxHeight = word.chars().map(c -> h[c-97]).max().getAsInt();
        return maxHeight*word.length();
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] h = IntStream.range(0,26).map(i -> input.nextInt()).toArray();
        String word = input.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
    }
}
