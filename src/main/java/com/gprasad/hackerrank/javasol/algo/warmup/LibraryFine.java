/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.algo.warmup;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class LibraryFine {

    public static void main(String[] args) {
        int fine = 0;
        Scanner input = new Scanner(System.in);
        int actDay = input.nextInt();
        int actMonth = input.nextInt();
        int actYear = input.nextInt();

        int expDay = input.nextInt();
        int expMonth = input.nextInt();
        int expYear = input.nextInt();

        if (actDay >= expDay && actMonth == expMonth && actYear == expYear) {
            fine = 15 * (actDay - expDay);
        } else if (actMonth > expMonth && actYear == expYear) {
            fine = 500 * (actMonth - expMonth);
        } else if (actYear > expYear) {
            fine = 10000;
        }
        System.out.println(fine);
    }

}
