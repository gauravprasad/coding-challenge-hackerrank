/*
 Sherlock and MiniMax (HackerRank java solution )
 */
package com.gprasad.hackerrank.javasol.algo.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class SherlockAndMiniMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }
        int p = input.nextInt();
        int q = input.nextInt();
        System.out.println(getMinimum(a, p, q));
    }

    private static Integer getMinimum(List<Integer> a, int p, int q) {
        int minimum = 0;
        Integer minimumNum = null;
        for (int i = p; i <= q; i++) {
            if (!a.contains(i)) {
                for (int num : a) {
                    if (minimumNum != null && minimum > Math.abs(num - i)) {
                        minimum = Math.abs(num - i);
                        minimumNum = p;
                    }
                    if(minimumNum == null)
                    {
                        minimum = Math.abs(num - i);
                        minimumNum = p;
                    }
                }
            }
        }
        return minimumNum;
    }

}
