/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.hackerrank.javasol.tutorial.crackingcodinginterview.ds;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author gq6pras
 */
public class StacksBalancedBrackets {

    public static boolean isBalanced(String expression) {
        if (expression.length() % 2 != 0) {
            return false;
        }
        Stack<Character> chars = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '{':
                    chars.push('}');
                    break;
                case '(':
                    chars.push(')');
                    break;
                case '[':
                    chars.push(']');
                    break;
                default:
                    if (chars.isEmpty() || chars.peek() != expression.charAt(i)) {
                        return false;
                    }
                    chars.pop();
            }
        }
        return chars.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if (answer) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
