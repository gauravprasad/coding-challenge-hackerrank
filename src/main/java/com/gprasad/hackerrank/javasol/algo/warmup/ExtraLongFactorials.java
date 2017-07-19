/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.algo.warmup;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author gq6pras
 */
public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fact(new BigInteger(Integer.toString(n))));
    }

    private static BigInteger fact(BigInteger n) {
        BigInteger result = new BigInteger(Integer.toString(0));
        if(n.equals(new BigInteger(Integer.toString(1))) || n.equals(new BigInteger(Integer.toString(0))))
        {
            return new BigInteger(Integer.toString(1));
        }
        result = fact(n.subtract(new BigInteger(Integer.toString(1)))).multiply(n) ;
        return result;
    }
}
