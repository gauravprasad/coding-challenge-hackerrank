/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.tutorial.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class Day26NestedLogic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int subDay = input.nextInt();
        int subMonth = input.nextInt();
        int subYear = input.nextInt();
        int dueDay = input.nextInt();
        int dueMonth = input.nextInt();
        int dueYear = input.nextInt();
        int fine = 0;
        if (subYear > dueYear) {
            fine = 10000;
        } else if (subMonth > dueMonth && subYear == dueYear) {
            fine = (subMonth - dueMonth) * 500;
        } else if (subDay > dueDay && subMonth == dueMonth && subYear == dueYear) {
            fine = (subDay - dueDay) * 15;
        }
        System.out.println(fine);
    }
}
