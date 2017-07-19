/*
 
Matching Anything But a Newline (Hackerrank Java Solution)

dot

The dot (.) matches anything (except for a newline).

[ach02.png]

Note: If you want to match (.) in the test string, you need to escape the dot by using a slash \..
In Java, use \\. instead of \..

Task

You have a test string .
Your task is to match the pattern , where each variable can be any single character except the newline.

Note

This is a regex only challenge. You are not required to write any code.
You only have to fill in the regex pattern in the blank (_________).

 */
package com.gprasad.hackerrank.javasol.regex.introduction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author gq6pras
 */
public class MatchingAnythingButaNewline {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.check(".");

    }
}

class Tester {

    public void check(String pattern) {

        Scanner scanner = new Scanner(System.in);
        String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        boolean match = m.matches();

        System.out.format("%s", match);
    }

}
